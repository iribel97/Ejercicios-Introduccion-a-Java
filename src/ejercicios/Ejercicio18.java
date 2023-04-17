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
public class Ejercicio18 {

    /*
    *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
    *y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
    *se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int valor;

        //matriz
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        System.out.print("De 0 hasta cuanto quiere que se llene su matriz: ");
        valor = scaner.nextInt();

        //llenar matriz A
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * valor);

            }
        }
        //llenar matriz B
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }

        //imprimir
        System.out.println("--------------------------------------------------");
        System.out.println("---------------------MATRIZ A---------------------");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("---------------------MATRIZ B---------------------");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

}
