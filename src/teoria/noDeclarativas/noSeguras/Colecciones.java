package teoria.noDeclarativas.noSeguras;

import java.util.Arrays;
import java.util.Random;

public class Colecciones {
    public static void main(String[] args) {
        final int TAMANNO = 100_000;
        Random random = new Random();
        int[] numbers = random.ints(
                0, 100).limit(TAMANNO).toArray();
        System.out.println("DATOS");
        System.out.println(Arrays.toString(numbers));
        int posicion = random.nextInt();
        System.out.printf("Buscando número de posición %d%n", posicion);
        System.out.printf("Encontrado %d%n", numbers[posicion]);

    }
}
