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
public class Extra19 {

    /*
    *Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    *(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int N;

        //variable booleana para compara si son o no iguales
        boolean bandera = true;

        //Pedir el valor de N
        System.out.print("de cuanto quiere que sea el arreglo de los dos vectores? ");
        N = scaner.nextInt();

        //vectores
        int vect1[] = new int[N];
        int vect2[] = new int[N];

        //llenar vectores de valores al azar
        for (int i = 0; i < N; i++) {
            vect1[i] = (int) (Math.random() * 2);
            vect2[i] = (int) (Math.random() * 2);
        }
        //verifivar si son o no iguales
        for (int i = 0; i < N; i++) {
            if (vect1[i] == vect2[i]) {
                bandera = true;
            } else {
                bandera = false;
                break;
            }
        }
        if (bandera == true) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        //imprimir vectores
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vect1[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vect2[i] + "]");
        }
        System.out.println("");
    }

}
