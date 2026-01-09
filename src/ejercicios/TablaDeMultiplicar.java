package ejercicios;

import java.util.Scanner;

/***
 * Ejercicio 4:
 *  En este ejercicio se pide al usuario un número entero
 *  para mostrar en consola una tabla de multiplicar
 */
public class TablaDeMultiplicar {
    static Scanner read = new Scanner(System.in);

    public static void tablaMultiplicar(){
        System.out.print("Ingrese un numero entero para continuar: ");
        int numMultiplicador = Integer.parseInt(read.nextLine());

        for(int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", numMultiplicador, i, numMultiplicador*i);
        }
    }

    public static void tablaMultiplicarWhile(){
        int numMultiplicador, iterador = 0;
        System.out.print("Ingrese un numero entero para continuar: ");
        numMultiplicador = Integer.parseInt(read.nextLine());
        while(iterador <= 10){
            System.out.printf("%d x %d = %d\n", numMultiplicador, iterador, numMultiplicador * iterador);
            iterador++;
        }
    }
}
