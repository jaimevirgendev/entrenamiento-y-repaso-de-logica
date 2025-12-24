import calentamiento.EsPar;

public class Main {
    public static void main(String[] args) {
        esPar();
    }

    private static void esPar(){
        boolean isPar = EsPar.isPar();
        if (!isPar){
            System.out.println("No es par");
        } else {
            System.out.println("Es par");
        }
    }
}