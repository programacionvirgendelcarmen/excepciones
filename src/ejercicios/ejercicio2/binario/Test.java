package ejercicios.ejercicio2.binario;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Binario> binarios = new ArrayList<>();
         File inFile = new File("FICHEROS/binarios.txt");
        try (Scanner scanner = new Scanner(inFile)) {
            while (scanner.hasNextLine()){
               // System.out.println(scanner.nextLine());
                try {
                    binarios.add(new Binario(scanner.nextLine()));
                } catch (BinarioException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.printf("Valor de la suma: %d%n", Binario.sumarDecimalBinarios(binarios));
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.printf("No existe el fichero %s%n", inFile);
        }
        //System.out.println(binarios);
    }
}
