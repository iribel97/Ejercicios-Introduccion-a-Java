/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Extra5 {

    /*
    *Una obra social tiene tres clases de socios:
    *   o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
    *   o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que 
    *       los socios del tipo A.
    *   o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
    *   o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
    *       represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
     */
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        //Declaracion de variable
        char tipoClase;
        double valor;

        System.out.print("Digite el tipo de socio que es usted: ");
        tipoClase = scaner.next().charAt(0);
        System.out.println("--------------------------------------------------");
        System.out.println("Digite el costo del tratamiento: ");
        valor = scaner.nextDouble();
        System.out.println("--------------------------------------------------");
        switch (tipoClase) {
            case 'A', 'a':
                System.out.println("A usted por ser socio de clase A, se le aplica un 50% de descuento");
                System.out.println("Por, lo que debe de pagar es: " + (valor * 0.5));
                break;
            case 'B', 'b':
                System.out.println("A usted por ser socio de clase B, se le aplica un 35% de descuento");
                System.out.println("Por, lo que debe de pagar es: " + (valor * 0.85));
                break;
            case 'C', 'c':
                System.out.println("A usted por ser socio de clase C, no se le aplica descuento");
                System.out.println("Por, lo que debe de pagar: " + valor);
                break;
            default:
                System.out.println("Tipo de socio no identificado, por favor, intentelo nuevamente");
                ;
        }
    }

}
