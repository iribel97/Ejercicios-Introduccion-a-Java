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
public class Extra4 {

    /*
    *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //variables
        int num, cont;
        cont = 0;
        //algoritmo
        do {
            if (cont == 0) {
                System.out.print("Ingrese un numero del 1 al 10: ");
                num = scaner.nextInt();
                cont++;
            } else {
                System.out.println("Numero ingresado no concuerda con el rango.");
                System.out.print("Ingrese un numero del 1 al 10: ");
                num = scaner.nextInt();
            }
        } while (num > 10 || num < 1);
        System.out.println("--------------------------------------------------");
        System.out.println("Su equivalente en numeros romanos es: ");
        System.out.println("--------------------------------------------------");
        if (num < 4) {
            for (int i = 0; i < num; i++) {
                System.out.print("I");
            }
        } else if (num == 4) {
            System.out.println("IV");
        } else if (num == 5) {
            System.out.println("V");
        } else if (num < 9) {
            System.out.print("V");
            for (int i = 0; i < (num - 5); i++) {
                System.out.print("I");
            }
        } else if (num == 9) {
            System.out.println("IX");
        } else {
            System.out.println("X");
        }
        System.out.println("");
    }

}
