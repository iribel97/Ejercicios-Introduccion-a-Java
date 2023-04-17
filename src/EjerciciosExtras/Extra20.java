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
public class Extra20 {

    /*
    *Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
    *Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int N;
        System.out.print("Digite la cantidad del arreglo para el vector: ");
        N = scaner.nextInt();

        int vect[];

        vect = LlenarVector(N);

        ImprimirVector(vect, N);
    }

    //Llenar un vector ---------------------------------------------------------
    public static int[] LlenarVector(int arreglo) {
        int[] vector = new int[arreglo];

        for (int i = 0; i < arreglo; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        return vector;
    }

    //Imprimir vector ----------------------------------------------------------
    public static void ImprimirVector(int[] vector, int arreglo) {
        for (int i = 0; i < arreglo; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }

}
