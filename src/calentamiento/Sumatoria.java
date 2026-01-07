package calentamiento;

import java.util.Scanner;

/***
 * Ejercicio 6:
 *  En este ejercicio se pide que cree un programa
 *  en el cual se pueda obtener una sumatoria
 *  de un numero pedido por consola hasta es mismo
 *  numero. Ejemplo: Sumatoria de 100 = 0+1+2+3...n
 *  y el resultado es 5050.
 */
public class Sumatoria {
    static Scanner read = new Scanner(System.in);

    private static long sumatoria(){
        int suma = 0, numero;
        System.out.print("Ingrese un numero entero: ");
        numero = Integer.parseInt(read.nextLine());
        for(int i = 0; i <= numero; i++){
            suma += i;
        }
        return suma;
    }

    private static long sumatoriaWhile(){
        int suma = 0, numero, iterador = 0;
        System.out.print("Ingrese un numero entero: ");
        numero = Integer.parseInt(read.nextLine());
        while(iterador <= numero){
            suma += iterador;
            iterador++;
        }
        return suma;
    }
}
