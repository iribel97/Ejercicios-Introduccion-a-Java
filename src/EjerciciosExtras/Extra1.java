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
public class Extra1 {

    /*
    *Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    *Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int min;
        int hora, dia;

        System.out.print("Ingrese minutos: ");
        min = scaner.nextInt();

        dia = min / 1440;
        hora = min / 60 - dia * 24;

        System.out.println(dia + " dia/s, " + hora + " hora/s");
    }

}
