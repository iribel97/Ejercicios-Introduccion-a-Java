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
public class Extra18 {

    /*
    *Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
    *con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Dimension del vector
        int N;
        //Suma de los valores
        int sum = 0;

        //Pedir la dimension del vector
        System.out.print("Cuantos numeros va a ingresar? ");
        N = scaner.nextInt();

        //Vector
        int vector[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("----------------------------------------------");
            System.out.print("Ingrese el valor # " + (i + 1) + ": ");
            vector[i] = scaner.nextInt();

            sum += vector[i];
        }
        System.out.println("--------------------------------------------------");
        System.out.println("La suma de todos los valores ingresados es: " + sum);
    }

}
