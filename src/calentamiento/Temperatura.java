package calentamiento;

import java.util.Scanner;

/***
 * Ejercicio 5:
 *  Convertidor de temperatura, se le muestra un menu al usuario
 *  donde elige que es lo que quiere convertir, después se le
 *  retorna su valor mostrado en consola.
 */
public class Temperatura {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args){
        mainMenu();
    }

    private static void mainMenu(){
        int opc;
        do {
            System.out.println("*** Main menu ***");
            System.out.println("[1]: Celsius");
            System.out.println("[2]: Fahrenheit");
            System.out.println("[3]: Kelvin");
            System.out.println("[4]: Salir");
            System.out.print("Choose the correct option: ");
            opc = Integer.parseInt(read.nextLine());
            switch(opc){
                case 1:
                    menuCelsius();
                    System.out.println("-------------------------");
                    break;
                case 2:
                    menuFahrenheit();
                    System.out.println("-------------------------");
                    break;
                case 3:
                    menuKelvin();
                    break;
                case 4:
                    System.out.println("Ing. Jaime Orea Virgen");
                    System.out.println("Thanks you for using the program");
                    break;
                default:
                    System.out.println("Incorrect option, choose a correct option...");
                    read.nextLine();
            }
        } while(opc != 4);
    }

    private static void menuCelsius(){
        int opc, fahrenheit;
        double kelvin;
        do {
            System.out.println("*** Menu...");
            System.out.println("[1]: Celsius to Fahrenheit.");
            System.out.println("[2]: Celsius to Kelvin");
            System.out.println("[3]: Return to main menu");
            System.out.print("Ingrese la opción correcta: ");
            opc = Integer.parseInt(read.nextLine());

            switch(opc){
                case 1:
                    fahrenheit = celsiusFahrenheit();
                    System.out.println("Celsius to Fahrenheit: " + fahrenheit + "°F");
                    break;
                case 2:
                    kelvin = celsiusKelvin();
                    System.out.printf("Celsius to Kelvin: %.2f", kelvin , "°K");
                    read.nextLine();
                    break;
                case 3:
                    System.out.println("Returning to the main menu...");
                    System.out.print("Presiona enter para continuar...");
                    read.nextLine();//Limpiar el buffer para el regreso
                    break;
                default:
                    System.out.println("Incorrect option, choose a correct option...");
            }
        } while (opc != 3);
    }

    private static void menuFahrenheit(){
        int opc;
        double resultado;
        do {
            System.out.println("*** Menu de...");
            System.out.println("[1]: Fahrenheit a Celsius");
            System.out.println("[2]: Fahrenheit a Kelvin");
            System.out.println("[3]: Volver al menu principal");
            System.out.print("Ingrese la opción correcta: ");
            opc = Integer.parseInt(read.nextLine());
            switch(opc){
                case 1:
                    resultado = fahrenheitCelsius();
                    System.out.printf("Fahrenheit to Celsius: %f", resultado);
                    break;
                case 2:
                    resultado = fahrenheitKelvin();
                    System.out.printf("Fahrenheit to Kelvin: %f", resultado);
                    break;
                case 3:
                    System.out.println("Regresando al menu principal...");
                    System.out.print("Presiona enter para continuar...");
                    read.nextLine();//pausa
                    break;
                default:
                    System.out.println("Incorrect option, choose a correct option...");
            }
        } while(opc != 3);
    }

    private static void menuKelvin(){
        int opc;
        double resultado;
        do {
            System.out.println("*** Menu...");
            System.out.println("[1]: Kelvin to Celsius");
            System.out.println("[2]: Kelvin to Fahrenheit");
            System.out.println("[3]: Regresar al menu principal");
            System.out.print("Ingrese la opcion deseada: ");
            opc = Integer.parseInt(read.nextLine());
            switch(opc){
                case 1:
                    resultado = kelvinCelsius();
                    System.out.printf("Kelvin to Celsius: %f", resultado);
                    break;
                case 2:
                    resultado = kelvinFahrenheit();
                    System.out.printf("Kelvin to Fahrenheit: %f", resultado);
                    break;
                case 3:
                    System.out.println("Regresando al menu principal...");
                    System.out.print("Press enter to return to the main menu..");
                    break;
                default:
                    System.out.println("Incorrect option, choose a correct option...");

            }
        } while(opc != 3);
    }

    private static int celsiusFahrenheit(){
        int fahren, temperatura;
        System.out.print("Ingrese la temperatura en celsius: ");
        temperatura = Integer.parseInt(read.nextLine());
        fahren = (temperatura * 9/5) + 32;
        return fahren;
    }

    private static double celsiusKelvin() {
        int temperatura;
        double kelvin;
        System.out.print("Ingrese la temperatura en celsius: ");
        temperatura = Integer.parseInt(read.nextLine());
        kelvin = temperatura + 273.15;
        return kelvin;
    }

    private static double fahrenheitCelsius(){
        double celsius;
        int temperatura;
        System.out.print("Ingrese la temperatura en Fahrenheit: ");
        temperatura = Integer.parseInt(read.nextLine());
        celsius = (double)(temperatura - 32) * 5 / 9;
        return celsius;
    }

    private static double fahrenheitKelvin(){
        double kelvin, temperatura;
        System.out.print("Ingrese los grados en Fahrenheit: ");
        temperatura = Double.parseDouble(read.nextLine());
        kelvin = (temperatura - 32) * 5 / 9 + 273.15;
        return kelvin;
    }

    private static double kelvinCelsius() {
        double celsius, temperatura;
        System.out.print("Ingrese los grados Kelvin: ");
        temperatura = Double.parseDouble(read.nextLine());
        celsius = temperatura -273.15;
        return celsius;
    }

    private static double kelvinFahrenheit() {
        double temperatura, fahrenheit;
        System.out.print("Ingrese los grados en Fahrenheit: ");
        temperatura = Double.parseDouble(read.nextLine());
        fahrenheit = (temperatura - 273.15) * 9 / 5 + 32;
        return fahrenheit;
    }
}