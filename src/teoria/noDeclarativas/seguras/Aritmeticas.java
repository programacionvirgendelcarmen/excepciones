package teoria.noDeclarativas.seguras;

import java.util.Scanner;

public class Aritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sNumerador = "";
        do {
            System.out.println("introduce numerador:");
            sNumerador = scanner.nextLine();
        } while (! sNumerador.matches("\\d+"));
        int iNumerador = Integer.parseInt(sNumerador);

        String sDenominador = "";
        do {
            System.out.println("introduce denominador:");
            sDenominador = scanner.nextLine();
        } while (! sDenominador.matches("[0-9]+"));
        int iDenominador = Integer.parseInt(sDenominador);

        scanner.close();

        double division = 1.0 * iNumerador / iDenominador;
        System.out.printf("%d / %d = %.2f%n", iNumerador, iDenominador, division);
    }

}
