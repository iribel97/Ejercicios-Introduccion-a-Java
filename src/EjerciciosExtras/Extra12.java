/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

/**
 *
 * @author irina
 */
public class Extra12 {

    /*
    *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 
    *al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
     */
    public static void main(String[] args) {

        //variables para cada digito
        String con1, con2, cont3;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    con1 = String.valueOf(i);
                    con2 = String.valueOf(j);
                    cont3 = String.valueOf(k);
                    switch (i) {
                        case 3 ->
                            con1 = "E";
                    }
                    switch (j) {
                        case 3 ->
                            con2 = "E";
                    }
                    switch (k) {
                        case 3 ->
                            cont3 = "E";
                    }
                    System.out.print("[" + con1 + " - " + con2 + " - " + cont3 + "]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
