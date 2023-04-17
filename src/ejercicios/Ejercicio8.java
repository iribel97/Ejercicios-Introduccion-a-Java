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
public class Ejercicio8 {

    /*
    *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
    *Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
    *por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
    *Nota: investigar la función Lenght() en Java
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String frase;
            int longitudF;

            System.out.print("Ingrese una frase: ");
            frase = leer.nextLine();

            longitudF = frase.length();

            if (longitudF == 8) {
                System.out.println("CORRECTO!!!");
            } else {
                System.out.println("INCORRECTO!!!");
            }
        }
    }

}
