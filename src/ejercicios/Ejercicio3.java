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
public class Ejercicio3 {
    /*
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una frase: ");
        frase = scaner.nextLine();

        System.out.println("----------------------------------------");
        System.out.println("Todo mayuscula");
        System.out.println("La frase ingresada es: "+ frase.toUpperCase());
        System.out.println("----------------------------------------");
        System.out.println("Todo minuscula");
        System.out.println("La frase ingresada es: "+ frase.toLowerCase());
        
    }
}
