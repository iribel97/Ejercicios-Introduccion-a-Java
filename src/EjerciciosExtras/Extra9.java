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
public class Extra9 {

    /*
    *Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
    realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
    *Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
    *este resultado es el residuo, y el número de restas realizadas es el cociente.
    *Por ejemplo: 50 / 13:
    *   50 – 13 = 37 una resta realizada
    *   37 – 13 = 24 dos restas realizadas
    *   24 – 13 = 11 tres restas realizadas
    *   dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //variables para que ingrese el dividendo y divisor
        int divid, divis;
        //variable que cuente si el divisor y dividendo no son mayores que 1
        int contE = 0;

        //variable que guarde el residuo
        int res;
        //variable que cuente cuantas divisiones se hace
        int cont = 0;

        //pedir al usuario que ingrese dividendo y divisor
        //recordar que debe de ser mayor que 1
        do {
            if (contE == 0) {
                System.out.println("----------------------------------------------");
                System.out.print("Ingrese el dividendo: ");
                divid = scaner.nextInt();
                System.out.println("----------------------------------------------");
                System.out.print("Ingrese el divisor: ");
                divis = scaner.nextInt();
                System.out.println("----------------------------------------------");
                contE++;
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("NUMERO INGRESADO MENOR QUE 1, INTENTE DE NUEVO");
                System.out.println("----------------------------------------------");
                System.out.print("Ingrese el dividendo: ");
                divid = scaner.nextInt();
                System.out.println("----------------------------------------------");
                System.out.print("Ingrese el divisor: ");
                divis = scaner.nextInt();
                System.out.println("----------------------------------------------");
            }
        } while (divid < 1 || divis < 1);

        System.out.println("----------------------------------------------");
        System.out.println("--------DIVISION CON RESTAS SUCESIVAS---------");
        System.out.println("----------------------------------------------");
        do {
            res = divid - divis;
            cont++;
            if (res < 10 && divid < 10) {
                System.out.println("0" + divid + " - " + divis + " = 0" + res + " ---- " + cont + " resta/s realizada/s");
            } else if (res < 10) {
                System.out.println(divid + " - " + divis + " = 0" + res + " ---- " + cont + " resta/s realizada/s");
            } else {
                System.out.println(divid + " - " + divis + " = " + res + " ---- " + cont + " resta/s realizada/s");
            }

            divid = res;
        } while (res >= divis);
        System.out.println("----------------------------------------------");
        System.out.println("* Residuo = " + res);
        System.out.println("* Cociente = " + cont);
        System.out.println("----------------------------------------------");
    }

}
