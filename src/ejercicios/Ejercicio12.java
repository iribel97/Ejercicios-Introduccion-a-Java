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
public class Ejercicio12 {

    /*
    *Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
    *este tipo de dispositivo lee cadenas enviadas por el usuario. 
    *Las cadenas deben llegar con un formato fijo: 
    *   - tienen que ser de un máximo de 5 caracteres de largo, 
    *   - el primer carácter tiene que ser X y el último tiene que ser una O. 
    *Las secuencias leídas que respeten el formato se consideran correctas, 
    *la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
    *y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
    *Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
    *correctas e incorrectas recibidas. 
    *Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            //Variable que va a leer las cadenas ingresadas por el usuario
            String cadena;
            //Variables que vana  contar las correcras y las incorrectas
            int contC, contI;
            //variable que va a guardar la longitud de la cadena
            int cantidadC;

            //inicializar variables
            contC = 0;
            contI = 0;

            do {
                System.out.print("Ingrese la cadena de caracteres: ");
                cadena = leer.next();

                cantidadC = cadena.length();
                if (!cadena.equals("&&&&&")) {
                    if (cantidadC == 5 && cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(cantidadC - 1).equalsIgnoreCase("O")) {
                        contC++;
                    } else {
                        contI++;
                    }
                }

            } while (!cadena.equals("&&&&&"));
            //Limpiar ventana
            System.out.print("\033[H\033[2J");
            System.out.flush();
            //INFORME
            System.out.println("---------------------------------------------------");
            System.out.println("----------------------INFORME----------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("Las cadenas ingresadas correctamente han sido: " + contC);
            System.out.println("---------------------------------------------------");
            System.out.println("las cadenas ingresadas incorrectamente han sido: " + contI);
        }
    }

}
