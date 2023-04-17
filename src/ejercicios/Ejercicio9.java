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
public class Ejercicio9 {

    /*
    *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
    *Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
    *en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String frase;

            System.out.print("Ingrese una frase o palabra: ");
            frase = leer.nextLine();

            if (frase.substring(0, 1).equals("A")) {
                System.out.println("CORRECTO!!");
            } else {
                System.out.println("INCORRECTO!!");
            }
            if (frase.charAt(0) == 'A') {
                System.out.println("CORRECTO!!");
            } else {
                System.out.println("INCORRECTO!!");
            }
        }
    }

}
