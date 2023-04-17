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
public class Extra16 {

    /*
    *Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
    *ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, 
    *el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el 
    *usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Varible para la cantidad de personas
        int N;

        //pedir el numero de personas
        System.out.print("Numero de personas: ");
        N = scaner.nextInt();

        Personas(N);
    }

    //Funcion ------------------------------------------------------------------
    public static void Personas(int num) {
        Scanner leer = new Scanner(System.in);

        String[][] personas = new String[num][2];

        //Pedir nombre y edad
        for (int i = 0; i < num; i++) {
            System.out.println("------------------------------------------");
            System.out.println("PERSONA # " + (i + 1));

            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("Nombre: ");
                    personas[i][j] = leer.nextLine();
                } else if (j == 1) {
                    System.out.print("Edad: ");
                    personas[i][j] = leer.nextLine();
                }
            }
            System.out.println("------------------------------------------");
        }

        //Imprimir
        for (int i = 0; i < num; i++) {
            System.out.println("NOMBRE: " + personas[i][0] + " - EDAD: " + personas[i][1]);
            if (Integer.parseInt(personas[i][1]) > 17) {
                System.out.println("Es mayor de edad");
                System.out.println("------------------------------------------");
            } else if (Integer.parseInt(personas[i][1]) < 18) {
                System.out.println("Es menor de edad");
                System.out.println("------------------------------------------");
            }
        }
    }

}
