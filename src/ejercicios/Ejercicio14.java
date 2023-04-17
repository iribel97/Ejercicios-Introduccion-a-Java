/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio14 {

    /*
    *Crea una aplicación que a través de una función nos convierta una cantidad de euros 
    *introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
    *La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será una cadena, 
    *este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    *El cambio de divisas es:
    *   - 0.86 libras es un 1 €
    *   - 1.28611 $ es un 1 €
    *   - 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            double moneda;
            String tmoneda;

            System.out.print("Ingrese la cantidad en euros: ");
            moneda = leer.nextDouble();
            System.out.print("A que tipo de moneda desea convertir? (dolares, yenes o libras) ");
            tmoneda = leer.next();
            CambiarMoneda(moneda, tmoneda);
        }
    }

    public static void CambiarMoneda(double cant, String cambio) {
        switch (cambio) {
            case "dolar", "dolares":
                System.out.println("Serian: " + (cant * 1.28611) + " dolares");
                break;
            case "yen", "yenes":
                System.out.println("Serian: " + (cant * 129.852) + " yenes");
                break;
            case "libras", "libra":
                System.out.println("Serian: " + (cant * 0.86) + " libras");
                break;
            default:
                System.out.println("Tipo de moneda no definida, intentelo de nuevo");
        }
    }
}
