package ejercicios.ejercicio2.hexadecimal;

public class Hexadecimal {
    private String valorHexadecimal; //del 0 al 9 y de la a la f

    public Hexadecimal(String valorHexadecimal) throws HexadecimalException {
        if (valorHexadecimal.toLowerCase().matches("[0-9a-f]+"))
            this.valorHexadecimal = valorHexadecimal;
        else
            throw new HexadecimalException("No valor válido: " + valorHexadecimal);
    }

    public String getValorHexadecimal() {
        return valorHexadecimal;
    }

    public void setValorHexadecimal(String valorHexadecimal) throws HexadecimalException {
        if (valorHexadecimal.toLowerCase().matches("[0-9a-f]+"))
            this.valorHexadecimal = valorHexadecimal;
        else
            throw new HexadecimalException("No valor válido: " + valorHexadecimal);
    }

    public int obtenerValorEnDecimal() {
       /* //1. Dar la vuelta a valorBinario
        String inverso = new StringBuilder(valorHexadecimal).reverse().toString();
        //2. Crear un acumulador para la suma
        int suma = 0;
        //3. Recorrer la cadena
        for (int i = 0; i < inverso.length(); i++) {
            char caracter = inverso.toLowerCase().charAt(i);
            //4. Obtener el char, con charAt multiplicar por 2⁰, 2¹, etc
            if (Character.isDigit(caracter))
                suma += (int) (Math.pow(16, i)) * (caracter - 48);
            else
                suma += (int) (Math.pow(16, i)) * (caracter - 87);
        }
        return suma;*/
        return Integer.parseInt(valorHexadecimal, 16);
    }
    @Override
    public String toString() {
        return String.format("HEXADECIMAL: %s, DECIMAL: %d",
                valorHexadecimal, obtenerValorEnDecimal());
    }

   /* public static void main(String[] args) {
        Hexadecimal hexadecimal = null;
        try {
            hexadecimal = new Hexadecimal("10dfk");
            System.out.println(hexadecimal);
            try {
                hexadecimal.setValorHexadecimal("012fgzzz");
                System.out.println(hexadecimal);
            } catch (HexadecimalException e) {
                System.out.println(e.getMessage());
            }
        } catch (HexadecimalException e) {
            System.out.println(e.getMessage());
        }


    }*/
}
