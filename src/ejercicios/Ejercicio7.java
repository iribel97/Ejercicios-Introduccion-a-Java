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
public class Ejercicio7 {
    /*
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
     * Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;
        boolean igual;

        System.out.print("Ingrse una frase o palabra: ");
        frase = leer.nextLine();

        igual = frase.equalsIgnoreCase("eureka");

        if(igual){
            System.out.println("CORRECTO!!!! la frase o palabra ingresada coincide");
        }else{
            System.out.println("INCORRECTO!!! Intentelo de nuevo");
        }

        
    }
}
