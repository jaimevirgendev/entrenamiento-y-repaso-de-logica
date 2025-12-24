package calentamiento;

import java.util.Random;
import java.util.Scanner;

/***
 * Ejercicio 2:
 *  En este ejercicio determina el mayor dados
 *  3 numeros, NOTA: se agregaron diferentes formas
 *  de hacerlo
 */
public class Mayor {

    static Random rnd = new Random();
    static Scanner read = new Scanner(System.in);
    static int numero1;
    static int numero2;
    static int numero3;

    public Mayor(){
        numero1 = 0;
        numero2 = 0;
        numero3 = 0;
    }
    //Este método es con números random
    public static int mayorV1(){
        numero1 = rnd.nextInt(10) + 1;
        numero2 = rnd.nextInt(10) + 1;
        numero3 = rnd.nextInt(10) + 1;
        if(numero1 > numero2 && numero1 > numero3){
            return numero1;
        }
        if(numero2 > numero1 && numero2 > numero3){
            return numero2;
        }
        if(numero3 > numero1 && numero3 > numero2){
            return numero3;
        }
        return -1;
    }

    // Este método se piden los números por consola
    public static int mayorV2(){
        System.out.print("Ingrese el primer numero entero: ");
        numero1 = Integer.parseInt(read.nextLine());
        System.out.print("Ingrese el segundo numero entero: ");
        numero2 = Integer.parseInt(read.nextLine());
        System.out.println("Ingrese el tercer numero entero: ");
        numero3 = Integer.parseInt(read.nextLine());
        if(numero1 > numero2 && numero1 > numero3){
            return numero1;
        }
        if(numero2 > numero1 && numero2 > numero3){
            return numero2;
        }
        if(numero3 > numero1 && numero3 > numero2){
            return numero3;
        }
        return -1;
    }

    // En este solo son las condiciones en una sola linea
    public static int mayorV3(){
        if(numero1 > numero2 && numero1 > numero3) return numero1;
        if(numero2 > numero1 && numero2 > numero3) return numero2;
        if(numero3 > numero1 && numero3 > numero2) return numero3;
        return -1;
    }

    // Aquí se hizo uso operador ternario para recortar lógica en el código
    public static int mayorV4(){
        int mayor;
        numero1 = rnd.nextInt(10) + 1;
        numero2 = rnd.nextInt(10) + 1;
        numero3 = rnd.nextInt(10) + 1;

        mayor = numero1 > numero2 && numero1 > numero3 ? numero1 : -1;
        mayor = numero2 > numero1 && numero2 > numero3 ? numero2 : -1;
        mayor = numero3 > numero1 && numero3 > numero2 ? numero3 : -1;
        return mayor;
    }
}
