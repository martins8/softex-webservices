const express = require('express')
const servidor = express()
const rota = express.Router()
const fs = require('fs')

servidor.use(express.json({extended:true}))

const readFile = () => {
    const conteudo = fs.readFileSync('dados.json', 'utf-8')
    return JSON.parse(conteudo)
}

const writeFile = (conteudo) => {
    const updateFile = JSON.stringify(conteudo)
    fs.writeFileSync('dados.json', updateFile, 'utf-8')
}

rota.get('/', (require, response) => {
    const conteudo = readFile()
    response.send(conteudo)
})

rota.post('/', (req, res) => {
    const {id, nome, idade, nota} = req.body
    const conteudoAtual = readFile()
    conteudoAtual.push({id, nome, idade, nota})
    writeFile(conteudoAtual)
    res.send({nome, idade, nota})
})

rota.put('/:id', (req, res) => {
    const {id} = req.params
    const {nome, idade, nota} = req.body
    const conteudoAtual = readFile()
    const dadoSelecionado = conteudoAtual.findIndex((item) => item.id === id)
    const {id: cId, nome: cNome, idade: cIdade, nota: cNota} = conteudoAtual[dadoSelecionado]
    const novoObjeto = {
        id: cId,
        nome: nome ? nome: cNome,
        idade: cIdade ? idade: cIdade,
        nota: cNota ? nota: cNota
    }

    conteudoAtual[dadoSelecionado] = novoObjeto
    writeFile(conteudoAtual)
    res.send(novoObjeto)
})

rota.delete('/:id', (req, res) => {
    const {id} = req.params
    const conteudoAtual = readFile()
    const dadoSelecionado = conteudoAtual.findIndex((item) => item.id === id)
    conteudoAtual.splice(dadoSelecionado, 1)
    writeFile(conteudoAtual)
    res.send(true)
})

servidor.use(rota)
servidor.listen(8080, () => {
    console.log('Servidor funcionando')
})