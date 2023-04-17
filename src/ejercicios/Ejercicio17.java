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
public class Ejercicio17 {

    /*
    *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
    *cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        //scaner para que ingrese la cantidad N
        Scanner scaner = new Scanner(System.in);

        int N;

        //vector que guarde la cantidad de digitos
        int digit[] = new int[5];
        //inicializamos, no se usa un bucle porque son de poca dimension
        digit[0] = 0;
        digit[1] = 0;
        digit[2] = 0;
        digit[3] = 0;
        digit[4] = 0;

        //Pedir al usuario que llene el vector
        System.out.print("De cuanto quiere que sea la dimension del vector: ");
        N = scaner.nextInt();

        int[] vector = new int[N];

        //llenar el vector con valores al azar
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 99);
            switch (Integer.toString(vector[i]).length()) {
                case 1:
                    digit[0]++;
                    break;
                case 2:
                    digit[1]++;
                    break;
                case 3:
                    digit[2]++;
                    break;
                case 4:
                    digit[3]++;
                    break;
                case 5:
                    digit[4]++;
                    break;
            }
        }
        //Imprimir vector
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

        //Mostrar cuantos numeros existen de acuerdo a la cantidad de digitos
        for (int i = 0; i < 5; i++) {
            System.out.println("numeros de " + (i + 1) + " digito/s son: " + digit[i]);
        }
    }

}
