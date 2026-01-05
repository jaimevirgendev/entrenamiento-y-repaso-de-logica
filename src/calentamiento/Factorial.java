package calentamiento;

/***
 * Ejercicio 3:
 *  Obtenga el factorial de n, recuerde que un factorial
 *  es cuando se toman los n números y se multiplica por
 *  su predecesor
 *  NOTA: se agregaran más formas de hacerlo,
 */

public class Factorial {

    // En este ejemplo se usa un ciclo para obtener el factorial
    public static int factorial(int numeroFactorial){
        numeroFactorial = 1;
        if(numeroFactorial == 0){
            return 1;
        } else {
            for(int i = 1; i <= numeroFactorial; i++){
                numeroFactorial *= i;
            }
        }
        return numeroFactorial;
    }

    public static long calcularFactorialRecursivo(int numero) {
        if (numero < 0){
            return -1;
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * calcularFactorialRecursivo(numero - 1);
    }

    public static int calcularFactorialFor(int numero){
        int resultado = 1;
        if(numero == 0 || numero == 1){
            return 1;
        }
        for(int i = 2; i <= numero; i++){
            resultado *= i;
        }
        return resultado;
    }

    public static long calcularFactorialWhile(int numero){
        int resultado = 1, iterador = 1;
        if (numero == 1 || numero == 0) return 1;
        while (iterador <= numero){
            resultado *= iterador;
            iterador++;
        }
        return resultado;
    }
}
