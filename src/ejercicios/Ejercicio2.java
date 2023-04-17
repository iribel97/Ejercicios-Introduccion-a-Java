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
public class Ejercicio2 {
    /*
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre;

        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();

        System.out.println("Hola " + nombre + "!!! Que tengas un buen dia");
    }
    
}
