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
public class Extra15 {

    /*
    *Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
    *restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
    *matemática y deben devolver sus resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Variable que guarde los dos numeros que le pide al usuario
        double num1, num2;
        //Variable que guarde los resultados
        double res;
        //variable par ala opcion a elegir
        int opc;

        //Menu de opciones
        System.out.println("|--------------------------------------------------|");
        System.out.println("|-------------OPERACIONES MATEMATICAS--------------|");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| 1. SUMA                                          |");
        System.out.println("| 2. RESTA                                         |");
        System.out.println("| 3. MULTIPLICACION                                |");
        System.out.println("| 4. DIVISION                                      |");
        System.out.println("|--------------------------------------------------|");
        System.out.print("| ELIJA UNA OPCION: ");
        opc = scaner.nextInt();
        System.out.println("|--------------------------------------------------|");

        //Pedir al usuario que ingrese los dos numeros
        System.out.print("| Ingrese un numero: ");
        num1 = scaner.nextDouble();
        System.out.println("|--------------------------------------------------|");
        System.out.print("| Ingrese otro numero: ");
        num2 = scaner.nextDouble();
        System.out.println("|--------------------------------------------------|");

        switch (opc) {
            case 1:

                res = Sumar(num1, num2);
                System.out.println("| " + num1 + " + " + num2 + " = " + res);
                System.out.println("|--------------------------------------------------|");
                break;
            case 2:
                res = Resta(num1, num2);
                System.out.println("| " + num1 + " - " + num2 + " = " + res);
                System.out.println("|--------------------------------------------------|");
                break;
            case 3:
                res = Multiplicar(num1, num2);
                System.out.println("| " + num1 + " * " + num2 + " = " + res);
                System.out.println("|--------------------------------------------------|");
                break;
            case 4:
                res = Dividir(num1, num2);
                System.out.println("| " + num1 + " / " + num2 + " = " + res);
                System.out.println("|--------------------------------------------------|");
                break;
            default:

                System.out.println("| OPCION NO ENCONTRADA                             |");
                System.out.println("|--------------------------------------------------|");
        }
    }

    //Funcion suma -------------------------------------------------------------
    public static double Sumar(double x, double y) {
        double respuesta;
        respuesta = x + y;
        return respuesta;
    }

    //Funcion resta ------------------------------------------------------------
    public static double Resta(double x, double y) {
        double respuesta;
        respuesta = x - y;
        return respuesta;
    }

    //Funcion multiplicar ------------------------------------------------------
    public static double Multiplicar(double x, double y) {
        double respuesta;
        respuesta = x * y;
        return respuesta;
    }

    //Funcion dividir ----------------------------------------------------------
    public static double Dividir(double x, double y) {
        double respuesta;
        respuesta = x / y;
        return respuesta;
    }

}
