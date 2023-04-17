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
public class Extra17 {

    /*
    *Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
    *para que nos indique si es o no un número primo, debe devolver true si es primo, sino false. 
    *Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
    *Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int num;

        System.out.print("Ingrese un nuero: ");
        num = scaner.nextInt();

        EsPrimo(num);
    }

    //--------------------------------------------------------------------------
    public static void EsPrimo(int numero) {
        int cont = 0;
        int resultado;

        for (int i = 1; i <= numero; i++) {
            resultado = numero % i;
            if (resultado == 0) {
                cont++;
            }
        }

        if (cont > 2) {
            System.out.println("El numero es primo: " + false);
        } else if (cont == 2) {
            System.out.println("El numero es primo: " + true);
        }
    }

}
