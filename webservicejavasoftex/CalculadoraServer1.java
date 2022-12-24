/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservicejavasoftex;
import javax.jws.WebService;

/**
 *
 * @author Arthur Martins
 */
    

@WebService(endpointInterface = "webservicejavasoftex.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {

  public float somar(float num1, float num2) {
    return num1 + num2;
  }

  public float subtrair(float num1, float num2) {
    return num1 - num2;
  }

  public float multiplicar(float num1, float num2) {
    return num1 * num2;
  }

  public float dividir(float num1, float num2) {
    return num1 / num2;
  }
}
