package teoria.declarativas.pre7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaFichero {
    public static void main(String[] args) {
        File inFile = new File("FICHEROS/datos.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(inFile);
            System.out.println("encontrado fichero");
        } catch (FileNotFoundException e) {
           //throw new RuntimeException(e);
           System.out.printf("No existe el fichero %s%n", inFile.toString());
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("cerrando scanner");
            }
        }
    }
}
