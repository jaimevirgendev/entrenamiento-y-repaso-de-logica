import calentamiento.EsPar;
import calentamiento.Factorial;

public class Main {
    public static void main(String[] args) {
        //esPar();
        factorial();
    }

    private static void esPar(){
        boolean isPar = EsPar.isPar();
        if (!isPar){
            System.out.println("No es par");
        } else {
            System.out.println("Es par");
        }
    }

    private static void factorial(){
        //int factorial = Factorial.factorialV2(5);
        //System.out.println("El factorial es: " + factorial);
    }
}