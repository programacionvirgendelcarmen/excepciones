package ejercicios.ejercicio2.hexadecimal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Hexadecimal> lista = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(
                    Path.of("FICHEROS/hexadecimal.txt"));

            for (String linea: lineas) {
                try {
                    lista.add(new Hexadecimal(linea));
                } catch (HexadecimalException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("No existe el fichero " + e.getMessage());

        }
        System.out.println("===========VALORES HEXADECIMAL==============");
        lista.forEach(System.out::println);
    }
}
