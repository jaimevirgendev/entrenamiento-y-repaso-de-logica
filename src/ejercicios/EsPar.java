package ejercicios;

import java.util.Scanner;

/***
 * Ejercicio 1:
 *  Pide un número entero y comprueba si es número par o impar
 *  NOTA: En cada ejercicio se compartira la solucion y el problema
 */

public class EsPar {
    public static boolean isPar(){
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = Integer.parseInt(read.nextLine());
        if (numero % 2 == 0){
            return true;
        }
        return false;
    }

}
