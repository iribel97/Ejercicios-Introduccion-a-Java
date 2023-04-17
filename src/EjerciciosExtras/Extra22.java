/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

/**
 *
 * @author irina
 */
public class Extra22 {

    /*
    *Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {

        int N = 5, M = 9;

        //variable que va a sumar los elementos
        int sum = 0;

        int[][] matriz = new int[N][M];

        //Llenar matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
                System.out.print("[" + matriz[i][j] + "] ");
                sum += matriz[i][j];
            }
            System.out.println("");
        }

        //Mostrar la suma
        System.out.println("La suma de todos los valores de la matriz es: " + sum);
    }

}
