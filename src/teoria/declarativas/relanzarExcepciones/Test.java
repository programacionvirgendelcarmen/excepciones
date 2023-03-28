package teoria.declarativas.relanzarExcepciones;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String fichero = "FICHEROS/suarios.csv";
        try {
            int numeroLineas =
                    Helper.contarLineasFichero(fichero);
            System.out.printf("Nº líneas del fichero %s son %d%n",
                    fichero, numeroLineas);
        } catch (IOException e) {
           // throw new RuntimeException(e);
            System.out.printf("No existe el fichero %s%n", fichero);
        }
    }
}
