package calentamiento;
import java.util.Scanner;

/***
 * Ejercicio 8:
 *  La serie de FIZZBUZZ, Los números que sean múltiplos de 3 se cambian por Fizz.
 *  Los números que sean múltiplos de 5 se cambian por Buzz.
 *  Los números que sean múltiplos de 3 y 5 se cambian por FizzBuzz. Escriba un programa que lea
 *  e imprima la serie FizzBuzz.
 */

public class FizzBuzz {
    private static void fizzBuzz(int numero){
        for(int i = 1; i <= numero; i++) {
            if (isDivisible3and5(i)) {
                System.out.println("FizzBuzz");
            } else if (isDivisible3(i)) {
                System.out.println("Fizz");
            } else if (isDivisible5(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isDivisible3and5(int numero){
        return (numero % 3 == 0) && (numero % 5 == 0);
    }

    private static boolean isDivisible3(int numero){
        return (numero % 3 == 0);
    }

    private static boolean isDivisible5(int numero){
        return (numero % 5 == 0);
    }
}
