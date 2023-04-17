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
public class Ejercicio19 {

    /*
    *Realice un programa que compruebe si una matriz dada es anti simétrica. 
    *Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, 
    *pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. 
    *La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int N;
        boolean bandera;

        //inicializar variables
        bandera = true;

        //Pedir la dimension
        System.out.print("Digite la dimension de su matriz: ");
        N = scaner.nextInt();

        //definir dimension
        int[][] matriz = new int[N][N];
        int[][] matrizT = new int[N][N];

        //Pedir al usuario que ingrese la matriz
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese las cantidades en el orden que se indica");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("posicion [" + i + " , " + j + "]: ");
                matriz[i][j] = scaner.nextInt();
            }
        }

        //Hacer la matriz transpuesta A =AT
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

        //Comprobar si es anti simetrica
        int filas = 0, columnas = 0;
        do {
            if (matriz[filas][columnas] != matrizT[filas][columnas]) {
                bandera = false;
            }
            filas++;
            columnas++;
        } while (bandera && filas < N);

        System.out.println("--------------------------------------------------");
        System.out.println("---------------------MATRIZ-----------------------");
        System.out.println("--------------------------------------------------");
        ImprimirMatriz(matriz, N, N);
        System.out.println("--------------------------------------------------");
        System.out.println("---------------MATRIZ-A-TRANSPUESTA---------------");
        System.out.println("--------------------------------------------------");
        ImprimirMatriz(matrizT, N, N);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------RESPUESTA---------------------");
        System.out.println("--------------------------------------------------");
        if (bandera == false) {
            System.out.println("La matriz no es anti simetrica");
        } else {
            System.out.println("La matriz si es anti simetrica");
        }
    }

    //--------------------------------------------------------------------------
    //Funcion para imprimir matriz
    public static void ImprimirMatriz(int[][] vector, int fil, int colum) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < colum; j++) {
                if (vector[i][j] < 0) {
                    System.out.print(" [" + vector[i][j] + "] ");
                } else {
                    System.out.print(" [ " + vector[i][j] + "] ");
                }
            }
            System.out.println(" ");
        }
    }

}
