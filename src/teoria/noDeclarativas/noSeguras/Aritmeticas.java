package teoria.noDeclarativas.noSeguras;

import java.util.Scanner;

public class Aritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numerador:");
        int numerador = scanner.nextInt();
        System.out.println("introduce denominador:");
        int denominador = scanner.nextInt();
        scanner.close();
        double division = 1.0 * numerador / denominador;
        System.out.printf("%d / %d = %.2f%n", numerador, denominador, division);
    }
}
