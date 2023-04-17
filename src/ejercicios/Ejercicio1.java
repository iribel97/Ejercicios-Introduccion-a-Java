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
public class Ejercicio1 {

     /*
     * Escribir un programa que pida dos números enteros por teclado 
     * y calcule la suma de los dos. 
     * El programa deberá después mostrar el resultado de la suma
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2, sum;

        System.out.println("Ingrese un numero entero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro o si gusta el mismo numero entero: ");
        num2 = leer.nextInt();

        sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);

    }
}
