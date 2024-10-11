package MoneyConverter;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*************** Currency Converter ******************");
            System.out.println("1. Convertir Monedas");
            System.out.println("2. Exit");
            System.out.print("Seleccione una opción del 1 al 2: ");

            int option = scanner.nextInt();

            if (option == 1) {
                converter.convert();
            } else if (option == 2) {
                System.out.println("Gracias por usar el Conversor de Monedas. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();


    }
}
