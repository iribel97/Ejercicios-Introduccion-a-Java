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
public class Ejercicio20 {

    /*
    *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
    *donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
    *Crear un programa que permita introducir un cuadrado por teclado y determine 
    *si este cuadrado es mágico o no. 
    *El programa deberá comprobar que los números introducidos son correctos, es decir, 
    *están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        //vectores que guarden las sumas
        int[] vectF = new int[3];
        int[] vectC = new int[3];
        //variables que guarden la suma de las diagonales
        int diagDI = 0;
        int diagID = 0;

        //parte de verificacion
        boolean bandera = true;

        //contador de errores
        int contE;

        //Pedir al usuario que ingrese los valores
        System.out.println("--------------------------------------------------");
        System.out.println("INGRESE VALORES DEL 1 AL 9 EN LA MATRIZ DE 3X3");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                contE = 0;
                do {
                    if (contE == 0) {
                        System.out.print("Ingrese numero en la posicion [" + i + " , " + j + "]: ");
                        matriz[i][j] = scaner.nextInt();
                        contE++;
                    } else {
                        System.out.println("----------------------------------------");
                        System.out.println("Numero ingresado no corresponde al rango");
                        System.out.println("----------------------------------------");
                        System.out.println("Intentelo de nuevo");
                        System.out.print("Ingrese numero en la posicion [" + i + " , " + j + "]: ");
                        matriz[i][j] = scaner.nextInt();
                    }
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }

        //inicializar vectores de suma
        vectF = InicializarVect(vectF, 3);
        vectC = InicializarVect(vectC, 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //Suma de filas
                vectF[i] = vectF[i] + matriz[i][j];
                //Sua de columnas
                vectC[j] = vectC[j] + matriz[j][i];
                if (i == j) {
                    diagID = diagID + matriz[i][j];
                }
                if ((i + j) == 2) {
                    diagDI = diagDI + matriz[i][j];
                }
            }
        }

        //evaluamos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((vectF[i] != vectC[j]) || (vectF[i] != diagID) || (vectF[i] != diagDI)) {
                    bandera = false;
                }
            }

        }

        if (bandera == false) {
            System.out.println("La matriz no es magica");
        } else {
            System.out.println("La matriz si es magica");
        }

    }

    //--------------------------------------------------------------------------
    //Funcion para imprimir matriz
    public static void ImprimirMatriz(int[][] vector, int fil, int colum) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(" [" + vector[i][j] + "] ");
            }
            System.out.println(" ");
        }
    }

    //--------------------------------------------------------------------------
    //Funcion para imprimir Vector
    public static void ImprimirVector(int[] vector, int fil) {
        for (int i = 0; i < fil; i++) {

            System.out.print(" [" + vector[i] + "] ");

        }
    }

    //--------------------------------------------------------------------------
    //Funcion para inicializar vectores
    public static int[] InicializarVect(int[] vector, int dimension) {
        for (int i = 0; i < dimension; i++) {
            vector[i] = 0;
        }
        return vector;
    }

}
