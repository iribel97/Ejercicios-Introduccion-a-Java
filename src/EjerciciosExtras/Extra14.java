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
public class Extra14 {

    /*
    *Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
    *Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
    *para averiguar la media de edad de los hijos de todas las familias.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Familia
        int N;

        //Total de hijos
        int M = 0;

        //Suma de edades y promedio
        double sumEd = 0, prom;

        //VARIABLE EDAD
        int Edad;

        System.out.print("Cuantas familias hay? ");
        N = scaner.nextInt();

        int[][] Familia = new int[N][2];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    Familia[i][0] = i + 1;
                } else {
                    System.out.println("------------------------------------------------------------------");
                    System.out.print("Para la familia # " + Familia[i][0] + " Cuantos hijos tiene? ");
                    Familia[i][j] = scaner.nextInt();
                    System.out.println("------------------------------------------------------------------");
                    //Sumo para saber el total de hijos
                    M = M + Familia[i][j];
                }

            }
        }

        //Pedir edades de sus hijos
        for (int i = 0; i < N; i++) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("FAMILIA #" + Familia[i][0] + " CON " + Familia[i][1] + " HIJO/S");
            System.out.println("------------------------------------------------------------------");
            for (int j = 0; j < Familia[i][1]; j++) {
                System.out.println("------------------------------------------------------------------");
                System.out.print("Ingrese la edad del hijo # " + (j + 1) + ": ");
                Edad = scaner.nextInt();
                sumEd = sumEd + Edad;
                System.out.println("------------------------------------------------------------------");
            }
        }

        //sacar Media(PROMEDIO)
        prom = sumEd / M;

        System.out.println("------------------------------------------------------------------");
        System.out.println("EL PROMEDIO DE EDADES DE LOS HIJOS ES DE: " + prom);
        System.out.println("------------------------------------------------------------------");
    }

}
