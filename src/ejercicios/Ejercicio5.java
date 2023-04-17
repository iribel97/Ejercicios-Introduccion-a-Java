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
public class Ejercicio5 {

    /*
     * Escribir un programa que lea un número entero por teclado y 
     * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
     * Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int num, doble, trible;
        double raiz;

        System.out.print("Ingrese un numero entero: ");
        num = scaner.nextInt();
        //Doble del numero ingresado
        doble = num*2;
        //Triple del numero ingresado
        trible = num*3;
        //Raiz cuadrada del numero ingresado
        raiz = Math.sqrt(num);

        System.out.println("----------------------------------------------");
        System.out.println("El doble del numero " + num + " es: " + doble);
        System.out.println("----------------------------------------------");
        System.out.println("El triple del numero " + num + " es: " + trible);
        System.out.println("----------------------------------------------");
        System.out.println("La raiz cuadrada del numero " + num + " es: " + raiz);
    }
    
}
