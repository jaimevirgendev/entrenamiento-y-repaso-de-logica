package calentamiento;

import java.util.Scanner;

public class EsPar {
    static Scanner read = new Scanner(System.in);
    public static boolean isPar(){
        System.out.print("Ingrese un numero entero: ");
        int numero = Integer.parseInt(read.nextLine());
        if (numero % 2 == 0){
            return true;
        }
        return false;
    }

}
