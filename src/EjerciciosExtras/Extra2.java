/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

/**
 *
 * @author irina
 */
public class Extra2 {

    /*
    *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
    *A continuación, realizar las instrucciones necesarias para que: 
    *   - B tome el valor de C, 
    *   - C tome el valor de A, 
    *   - A tome el valor de D y 
    *   - D tome el valor de B. 
    * Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {

        int A, B, C, D, aux;

        aux = 0;
        A = 27;
        B = 7;
        C = 9;
        D = 23;

        System.out.println("--------------------------------------------------");
        System.out.println("[ A ] = " + A);
        System.out.println("[ B ] = " + B);
        System.out.println("[ C ] = " + C);
        System.out.println("[ D ] = " + D);
        System.out.println("--------------------------------------------------");

//        aux = A + B + C + D;
//        C = aux - C - D - B;
//        B = aux - A - B - D;
//        A = D;
//        D = aux - C - B - A;
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("--------------------------------------------------");
        System.out.println("[ A ] = " + A);
        System.out.println("[ B ] = " + B);
        System.out.println("[ C ] = " + C);
        System.out.println("[ D ] = " + D);
        System.out.println("--------------------------------------------------");

    }

}
