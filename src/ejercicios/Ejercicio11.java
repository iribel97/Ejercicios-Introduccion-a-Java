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
public class Ejercicio11 {

    /*
    *Realizar un programa que pida dos números enteros positivos por teclado y 
    *muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y 
    *el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
    *El programa deberá ejecutarse hasta que se elija la opción 5. 
    *Tener en cuenta que, si el usuario selecciona la opción 5, 
    *en vez de salir del programa directamente, se debe mostrar el siguiente 
    *mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
    *Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int opcM, cont;
            float num1, num2, suma, resta, multi, divi;
            char opcS, opc;

            cont = 0;
            num1 = 0;
            num2 = 0;
            opcS = 'n';
            do {
                if (cont == 0) {
                    System.out.print("Ingrese la primera cantidad: ");
                    num1 = leer.nextFloat();
                    System.out.print("Ingrese la segunda cantidad: ");
                    num2 = leer.nextFloat();
                    cont++;
                } else {
                    System.out.println("Desea mantener los mismo numeros? (S/N)");
                    opc = leer.next().charAt(0);
                    if (opc == 'N' || opc == 'n') {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.print("Ingrese la primera cantidad: ");
                        num1 = leer.nextFloat();
                        System.out.print("Ingrese la segunda cantidad: ");
                        num2 = leer.nextFloat();
                        cont++;
                    }
                }

                System.out.println("----------------------------------------------------");
                System.out.println("----------------MENU DE OPERACIONES-----------------");
                System.out.println("----------------------------------------------------");
                System.out.println("      1. Suma");
                System.out.println("      2. Resta");
                System.out.println("      3. Multiplicacion");
                System.out.println("      4. Division");
                System.out.println("      5. Salir");
                System.out.println("----------------------------------------------------");
                System.out.print("Seleccione una opcion: ");
                opcM = leer.nextInt();
                switch (opcM) {
                    case 1:
                        suma = num1 + num2;
                        System.out.println("El resultado de la suma es: " + suma);
                        break;
                    case 2:
                        resta = num1 - num2;
                        System.out.println("El resultado de la resta es: " + resta);
                        break;
                    case 3:
                        multi = num1 * num2;
                        System.out.println("El resultado de la multiplicacion es: " + multi);
                        break;
                    case 4:
                        divi = num1 / num2;
                        System.out.println("El resultado de la division es: " + divi);
                        break;
                    case 5:
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        opcS = leer.next().charAt(0);
                        break;
                    default:
                        System.out.println("LA OPCION QUE INGRESO NO ES LA CORRECTA");

                }

            } while (opcS != 'S' && opcS != 's');
        }
    }

}
