package ejercicios.ejercicio2;

import java.util.List;

public class Binario {
    private String valorBinario;

    public Binario(String valorBinario) throws BinarioException {
        if (valorBinario.matches("[01]+"))
            this.valorBinario = valorBinario;
        else
            throw new BinarioException("No valor binario: " + valorBinario);
    }

    public String getValorBinario() {
        return valorBinario;
    }

    public void setValorBinario(String valorBinario) throws BinarioException {
        if (valorBinario.matches("[01]+"))
            this.valorBinario = valorBinario;
        else
            throw new BinarioException("No valor binario: " + valorBinario);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Binario{");
        sb.append("valorBinario='").append(valorBinario).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public int devolverValorDecimal() {
       // return Integer.parseInt(valorBinario, 2);
        //1. Dar la vuelta a valorBinario
        String inverso = new StringBuilder(valorBinario).reverse().toString();
        //2. Crear un acumulador para la suma
        int suma = 0;
        //3. Recorrer la cadena
        for (int i = 0; i < inverso.length(); i++) {
        //4. Obtener el char, con charAt multiplicar por 2⁰, 2¹, etc
            if (inverso.charAt(i) == '1')
                suma += (int) (Math.pow(2, i));
        }
        return suma;
    }
    public static int sumarDecimalBinarios(List<Binario> binarios) {
        int suma = 0;
        for (Binario binario : binarios) {
            suma += binario.devolverValorDecimal();
        }
        return suma;
    }

    public static void main(String[] args) {
        try {
            System.out.println(
                    new Binario("12").devolverValorDecimal());
        } catch (BinarioException e) {
            throw new RuntimeException(e);
        }
    }
}
