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
public class Ejercicio16 {

    /*
    *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios 
    *y le pida al usuario un numero a buscar en el vector. 
    *El programa mostrará donde se encuentra el numero y si se encuentra repetido
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Definir variables
        int N, num, cont;

        //inicializar variables
        cont = 0;

        //Pedir al usuario el valor de N
        System.out.print("Cual quiere que sea la dimension de su vector? ");
        N = scaner.nextInt();

        //Definir vector
        int[] vector = new int[N];

        //Llenar el vector de valores aleatorios
        vector = llenarVector(vector, N);

        //Vamos a imprimir vector
        if (N < 10) {
            for (int i = 0; i < N; i++) {
                System.out.print("[" + vector[i] + "]");
            }
            System.out.println("");

        } else {
            for (int i = 0; i < N; i = i + 10) {
                for (int j = i; j < i + 10; j++) {
                    System.out.print("[ " + vector[j] + " ]");
                }
                System.out.println("");
            }
        }

        //pedir al usuario un num para buscar
        System.out.println("Ingrese un numero entero que desea buscar");
        num = scaner.nextInt();

        //buscar vector
        for (int i = 0; i < N; i++) {
            if (vector[i] == num) {
                if (cont == 0) {
                    System.out.println("Numero encontrado en la posicion: [" + i + "]");

                } else {
                    System.out.println("                                  [" + i + "]");
                }
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Numero no encontrado");
        }
    }

    //--------------------------------------------------------------------------
    //Funcion para llenar vector
    public static int[] llenarVector(int[] vec, int dimension) {

        for (int i = 0; i < dimension; i++) {
            vec[i] = (int) (Math.random() * 10);
        }

        return vec;
    }

}
