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
public class Ejercicio10 {

    /*
    *Escriba un programa en el cual se ingrese un valor límite positivo, 
    *y a continuación solicite números al usuario hasta que la suma 
    *de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            //Variables
            float lim, num, sum;

            //inicializar variable suma
            sum = 0;

            //Pedir al usuario el limite
            System.out.println("ingrese un valor limite positivo");
            lim = leer.nextFloat();

            do {
                System.out.println("ingrese un numero");
                num = leer.nextFloat();
                sum = sum + num;
            } while (sum <= lim);

            System.out.println("la suma supero el limite por: " + (sum - lim));
        }
    }

}
