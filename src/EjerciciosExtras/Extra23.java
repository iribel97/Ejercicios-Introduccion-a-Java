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
public class Extra23 {

    /*
    *Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
    *a medida que el usuario las va ingresando, construya una “sopa de letras para 
    *niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en 
    *orden horizontal en una fila que será seleccionada de manera aleatoria. Una 
    *vez concluida la ubicación de las palabras, rellene los espacios no utilizados 
    *con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de 
    *letras creada. Nota: Para resolver el ejercicio deberá investigar cómo se utilizan 
    *las siguientes funciones de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
//------------------------------------------------------------------------------
        //Matriz de 20X20
        String[][] sopaL = new String[20][20];
        //Vector que va a guardar las palabras
        String[] palabra = new String[5];
//------------------------------------------------------------------------------
        //Longitud de la palabra
        int cantidad;
        //contador de errores
        int contE;
        //numero al azar
        int num;

        //Pedir palabras
        System.out.println("INGRESE PALABAS DE MIN 3 Y MAX 5 CARACTERES");
        for (int i = 0; i < 5; i++) {
            contE = 0;
            do {
                if (contE == 0) {
                    System.out.println("------------------------------------------------------");
                    System.out.print("Ingrese palabra #" + (i + 1) + ": ");
                    palabra[i] = scaner.next();
                    cantidad = palabra[i].length();
                    contE++;
                } else {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Palabra no cumple con la condicion, intentelo de nuevo");
                    System.out.println("------------------------------------------------------");
                    System.out.print("Ingrese palabra #" + (i + 1) + ": ");
                    palabra[i] = scaner.next();
                    cantidad = palabra[i].length();
                }
            } while (cantidad > 5 || cantidad < 3);
        }

        //Inicializar la matriz de 20X20
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                num = (int) (Math.random() * 9);
                sopaL[i][j] = String.valueOf(num);
                //System.out.print("[" + sopaL[i][j] + "]");
            }
            //System.out.println("");
        }

        //Llenar matriz con las palabras
        /*Primer for para la palabra*/
        for (int i = 0; i < 5; i++) {
            //Saber la cantidad de la palabra
            cantidad = palabra[i].length();
            //Numero de fila al azar
            num = (int) (Math.random() * 19);

            /*For para la matriz*/
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < cantidad; k++) {
                    if (num == j) {
                        sopaL[j][k] = String.valueOf(palabra[i].charAt(k));
                    }
                }
            }
        }

        //Imprimir la matriz de 20X20
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                System.out.print("[" + sopaL[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
