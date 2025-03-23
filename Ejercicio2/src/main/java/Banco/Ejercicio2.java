/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Banco;

/**
 *
 * @author Gercray
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Banco banco = new Banco();
        
        banco.pagosFactura("Agua", 500);
        banco.transferencia(400);
        banco.retiro(500);
    }
}
