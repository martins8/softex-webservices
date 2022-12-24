/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webservicejavasoftex;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {
  @WebMethod float somar(float numero1, float numero2);
  @WebMethod float subtrair(float numero1, float numero2);
  @WebMethod float multiplicar(float numero1, float numero2);
  @WebMethod float dividir(float numero1, float numero2);
}
