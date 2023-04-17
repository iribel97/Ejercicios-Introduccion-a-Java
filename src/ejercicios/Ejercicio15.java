/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author irina
 */
public class Ejercicio15 {

    /*
    *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros 
    *y los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        // definir arreglo
        int[] num = new int[100];

        //aplicando un algoritmo
        //for (int i = 0; i < 100; i++) {
        //   num[i] = i;
        //}
        //llenar un vector con funciones
        num = llenarVector(num, 100);

        //Mostrar vector
        ImprimirRango(num, 10, 0);
        ImprimirRango(num, 20, 10);
        ImprimirRango(num, 30, 20);
        ImprimirRango(num, 40, 30);
        ImprimirRango(num, 50, 40);
        ImprimirRango(num, 60, 50);
        ImprimirRango(num, 70, 60);
        ImprimirRango(num, 80, 70);
        ImprimirRango(num, 90, 80);
        ImprimirRango(num, 100, 90);
    }

    //--------------------------------------------------------------------------
    public static void ImprimirRango(int[] vector, int cant, int valorI) {
        for (int i = valorI; i < cant; i++) {
            if (valorI < 10) {
                System.out.print("[0" + vector[i] + "]");
            } else {
                System.out.print("[" + vector[i] + "]");
            }

        }
        System.out.println("");
    }

    //--------------------------------------------------------------------------
    public static int[] llenarVector(int[] vector, int cant) {
        //int[] vector = new int[cant];
        for (int i = 0; i < cant; i++) {
            vector[i] = i;
        }
        return vector;
    }

}
