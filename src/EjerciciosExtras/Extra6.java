/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Extra6 {

    /*
    *Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
    *por debajo de 1.60 mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);

        int N, cont;
        double alturas, prom, sum;
        DecimalFormat df = new DecimalFormat("0.00");

        //Variables que necesitan ser inicializadas
        cont = 0;
        sum = 0.0;
        //Pedir al usuario el valor de N
        System.out.print("De cuantas personas va a ingresar la altura? ");
        N = scaner.nextInt();

        //Pedir al usuario que ingrese la altura
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la altura de la " + (i + 1) + "a persona en metros: ");
            alturas = scaner.nextDouble();

            if (alturas < 1.60) {
                sum = sum + alturas;
                cont++;
            }
        }

        //Sacar promedio
        prom = sum / cont;

        //Mostrar resultados
        System.out.println("--------------------------------------------------");
        System.out.println("El promedio de personas menores a 1.6 mts es:");
        System.out.println("--------------------------------------------------");
        System.out.println(df.format(prom));

    }

}
