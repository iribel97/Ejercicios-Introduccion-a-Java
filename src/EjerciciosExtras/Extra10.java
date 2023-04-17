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
public class Extra10 {

    /*
    *Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
    *dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su 
    *respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario 
    *ingresar su respuesta nuevamente. 
    *Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //Variable que gurade los numeros aleatorios y la respuesta
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int resp = num1 * num2;

        //variable que ingresa el usuario
        int num;

        //cont de Errores
        int contE = 0;

        //Algoritmo
        System.out.println("----------------------------------------------");
        System.out.println("--ADIVINE EL RESULTADO DE UNA MULTIPLICACION--");
        System.out.println("----------------------------------------------");
        System.out.println(resp);
        do {
            if (contE == 0) {
                System.out.print("Ingrese un numero entero: ");
                num = scaner.nextInt();
                contE++;
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("Incorrecto, intentelo de nuevo");
                System.out.println("----------------------------------------------");
                System.out.print("Ingrese un numero entero: ");
                num = scaner.nextInt();
            }

            if (num == resp) {
                System.out.println("Respuesta correcta");
                break;
            }
        } while (num != resp);
    }

}
