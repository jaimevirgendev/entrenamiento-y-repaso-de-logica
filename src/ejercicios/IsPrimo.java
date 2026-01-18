package ejercicios;

import java.util.Scanner;

public class IsPrimo {
    static Scanner read = new Scanner(System.in);
    private static boolean isPrimo(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 ) return false;
        }
        return true;
    }
}
