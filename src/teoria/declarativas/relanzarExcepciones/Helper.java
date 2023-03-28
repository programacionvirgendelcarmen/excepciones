package teoria.declarativas.relanzarExcepciones;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Helper {
    //método estático que devuelva el nº líneas leíadas
    //de un fichero. Devuelve int y se le pasa como parámetro
    //una cadena que contiene la ruta del fichero
    public static int contarLineasFichero(String ruta) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(ruta));
        return lineas.size();
    }
}
