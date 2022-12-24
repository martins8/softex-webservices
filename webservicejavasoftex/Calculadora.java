/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webservicejavasoftex;
import javax.xml.ws.Endpoint;
/**
 *
 * @author Arthur Martins
 */
public class Calculadora {
    public static void main(String[] args)
  {
    Endpoint.publish("http://127.0.0.1:9876/calc",
    new CalculadoraServerImpl());
  }
}
