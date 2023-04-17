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
public class Extra8 {

    /*
    *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener 
    *la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad 
    *de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
    *Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //variable que va a leer los numeros
        int num;
        //variable que va a contar los numeros
        int cont = 0;
        //variable que va a contar los numeros pares
        int contP = 0;
        //variable que va a contar los numeros impares
        int contI = 0;

        //algoritmo del programa
        do {
            System.out.print("Ingrese un numero mayor que 0: ");
            num = scaner.nextInt();
            if (num % 5 == 0) {
                break;
            } else {
                if (cont % 2 == 0) {
                    contP++;
                } else {
                    contI++;
                }
                cont++;
            }

        } while (num % 5 != 0 && num > 0);

        if (cont == 0 || num < 0) {
            System.out.println("El numero ingresado es un numero negativo");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("------INFORME DE LOS NUMEROS INGRESADOS-------");
            System.out.println("----------------------------------------------");
            System.out.println("* Se ingresaron " + cont + " numeros en total");
            System.out.println("----------------------------------------------");
            System.out.println("Donde:");
            System.out.println(" * " + contP + " son pares");
            System.out.println(" * " + contI + " son impares");
            System.out.println("----------------------------------------------");
        }
    }

}
