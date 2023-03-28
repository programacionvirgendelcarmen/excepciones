package teoria.declarativas.post7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaFicheros {
    public static void main(String[] args) {
        File inFile = new File("FICHEROS/datos.txt");
        try (Scanner scanner = new Scanner(inFile)) {
            System.out.println("encontrado fichero");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.printf("No existe el fichero %s%n", inFile.toString());
        }
    }
}
