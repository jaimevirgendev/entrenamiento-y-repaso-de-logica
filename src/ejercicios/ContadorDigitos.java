package ejercicios;

import java.util.Scanner;

public class ContadorDigitos {
    static Scanner read = new Scanner(System.in);
    //Este algoritmo es ineficiente
    private static void contador(){
        int numero;
        System.out.print("Ingrese el numero a identificar: ");
        numero = Integer.parseInt(read.nextLine());
        String contador = Integer.valueOf(Math.abs(numero)).toString();
        System.out.println("El numero de digitos es: " + contador.length());
    }

    //Este se resolverá de manera matematica
    private static int contadorV2(){
        int numero, digitos;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(read.nextLine());
        if(numero == 0) System.out.println("Tiene un digito");
        digitos = (int) Math.log10(Math.abs(numero)) + 1;
        return digitos;
    }

    //Este se resuelve de metodo iterativo
    private static int contadorV3(){
        int contador = 0, numero;
        System.out.print("Ingrese su numero: ");
        numero = Integer.parseInt(read.nextLine());
        if(numero == 0) return 1;
        while(numero != 0){
            numero /= 10;
            contador++;
        }
        return contador;
    }

}
