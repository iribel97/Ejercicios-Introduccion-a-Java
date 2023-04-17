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
public class Extra7 {

    /*
    *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
    *el promedio de n números (n>0). El valor de n se solicitará al principio del programa y 
    *los números serán introducidos por el usuario. Realice dos versiones del programa, 
    *una usando el bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int N, num, Min, Max, cont;
        double prom, sum;

        //inivializar contador y sum
        //contador para el while
        //cont = 1;
        //contador para el do-while
        cont = 0;

        sum = 0;
        Max = 0;
        Min = 0;

        //Pedir al usuario cuantos numeros va a ingresar
        System.out.print("Cuantos numeros va a ingresar: ");
        N = scaner.nextInt();

        //Forma 1 usando while
        /*
        System.out.print("Ingrese un numero entero mayor que 0: ");
        num = scaner.nextInt();
        Max = 0;
        Min = num;
        while (num > 0 && cont <= N) {
            if (cont > 1) {
                System.out.print("Ingrese un numero entero mayor que 0: ");
                num = scaner.nextInt();
            
            }
            sum = sum + num;
            if (num > Max) {
                Max = num;
            }
            if (num < Min) {
                Min = num;
            }
           cont++;
        }
         */
        //Forma 2 usando do-while
        do {
            if (cont == 0) {
                System.out.print("Ingrese un numero entero mayor que 0: ");
                num = scaner.nextInt();
                Max = 0;
                Min = num;
            } else {
                System.out.print("Ingrese un numero entero mayor que 0: ");
                num = scaner.nextInt();
            }
            sum = sum + num;
            if (num > Max) {
                Max = num;
            }
            if (num < Min) {
                Min = num;
            }
            cont++;
        } while (num > 0 && cont < N);

        //Sacar promedio
        prom = sum / N;

        //Imprimir resultados
        if (cont > 0) {
            System.out.println("----------------------------------------------");
            System.out.println("El numero menor ingresado es: " + Min);
            System.out.println("----------------------------------------------");
            System.out.println("El numermo mayor ingresado es: " + Max);
            System.out.println("----------------------------------------------");
            System.out.println("El promedio de los numero ingresados es: " + prom);
            System.out.println("----------------------------------------------");
        } else if (num <= 0 || cont == 0) {
            System.out.println("----------------------------------------------");
            System.out.println("Numero ingresado no cumple con la orden, por favor reinicie el programa");
            System.out.println("----------------------------------------------");
        }

    }

}
