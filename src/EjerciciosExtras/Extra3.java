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
public class Extra3 {

    /*
    *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
    *Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String letra;

        System.out.print("Ingrese una letra: ");
        letra = scaner.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {

            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada es una consonante");
        }
    }
}
