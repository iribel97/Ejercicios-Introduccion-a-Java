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
public class Ejercicio6 {

    /*
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            float num;

            System.out.print("Ingrese un numero para determinar si es par o impar: ");
            num = leer.nextFloat();
            System.out.println("-----------------------------------------------------------");
            if(num%2 >= 0.0 && num%2 <=0.9){
                System.out.println("El numero ingresado es par");
            }else{
                System.out.println("El numero ingresado es impar");
            }
            System.out.println(num%2);
        }
        
    }
    
}
