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
public class Extra21 {

    /*
    *Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
    *adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
    *Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos 
    *evaluativos y 2 por parciales.
    *Las ponderaciones de cada nota son:
    *   - Primer trabajo práctico evaluativo 10%
    *   - Segundo trabajo práctico evaluativo 15%
    *   - Primer Integrador 25%
    *   - Segundo integrador 50%
    *Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
    *programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
    *teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //variable contar aprobados y desaprobados
        double contA = 0, contDA = 0;

        //Matriz de 10 filas y 5 columnas
        double[][] estudiantes = new double[10][5];

        //Ingresar notas
        System.out.println("--------------------------------------------------");
        System.out.println("------------------INGRESAR NOTAS------------------");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(" * ESTUDIANTE #" + (i + 1));
            System.out.println("--------------------------------------------------");
            for (int j = 0; j < 5; j++) {
                switch (j) {
                    case 0 -> {
                        System.out.print("    Primer trabajo practico: ");
                        estudiantes[i][j] = scaner.nextDouble();
                    }
                    case 1 -> {
                        System.out.print("    Segundo trabajo practico: ");
                        estudiantes[i][j] = scaner.nextDouble();
                    }
                    case 2 -> {
                        System.out.print("    Primer Integrador: ");
                        estudiantes[i][j] = scaner.nextDouble();
                    }
                    case 3 -> {
                        System.out.print("    Segundo integrador: ");
                        estudiantes[i][j] = scaner.nextDouble();
                        System.out.println("--------------------------------------------------");
                    }
                    default -> {
                        //Promedio
                        estudiantes[i][j] = (estudiantes[i][0] * 0.1) + (estudiantes[i][1] * 0.15) + (estudiantes[i][2] * 0.25) + (estudiantes[i][3] * 0.50);
                        if (estudiantes[i][j] >= 7) {
                            contA++;
                        } else {
                            contDA++;
                        }
                    }
                }
            }
        }

        //Imprimir Informe
        System.out.println("--------------------------------------------------");
        System.out.println("-----------------INFORME DE NOTAS-----------------");
        System.out.println("--------------------------------------------------");
        //Imprimir para verificar
        for (int i = 0; i < 10; i++) {
            System.out.println(" * ESTUDIANTE #" + (i + 1));
            System.out.println("--------------------------------------------------");
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + estudiantes[i][j] + "]");
            }
            System.out.println("");
            System.out.println("--------------------------------------------------");
        }

        System.out.println("      Aprobados: " + contA);
        System.out.println("      Desaprobados: " + contDA);
        System.out.println("--------------------------------------------------");
    }

}
