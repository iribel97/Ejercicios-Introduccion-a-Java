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
public class Ejercicio13 {

    /*
    *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int cuadrado;

            System.out.print("cuantos cm tiene su cuadrado?(Ingrese una cantidad entera) ");
            cuadrado = leer.nextInt();

            for (int i = 0; i < cuadrado; i++) {
                for (int j = 0; j < cuadrado; j++) {
                    if (i == 0 || i == (cuadrado - 1)) {
                        System.out.print(" * ");
                    } else if (j == 0 || j == (cuadrado - 1)) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println("");
            }
        }
    }

}
