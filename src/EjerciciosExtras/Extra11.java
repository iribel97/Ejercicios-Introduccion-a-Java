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
public class Extra11 {

    /*
    *Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
    *Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de 
    *dígitos matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo 
    *entero truncan los números o resultados.
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        //variable que guarde el numero que ingrese el usuario
        int num;
        //variable contador
        int cont = 0;
        //variable que guarde el cociente
        int coc;

        //pedir al usuario el numero
        System.out.print("Ingrese un numero entero: ");
        num = scaner.nextInt();

        //algoritmo
        do {

            coc = num / 10;
            cont++;
            num = coc;

        } while (coc > 10);

        //resultados
        if (cont == 1) {
            System.out.println("----------------------------------------------------");
            System.out.println("El numero ingresado tiene " + cont + " digito");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("----------------------------------------------------");
            System.out.println("El numero ingresado tiene " + (cont + 1) + " digitos");
            System.out.println("----------------------------------------------------");
        }

    }

}
