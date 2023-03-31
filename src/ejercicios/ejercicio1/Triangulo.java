package ejercicios.ejercicio1;

public class Triangulo {
    private int a;
    private int b;
    private int c;

    public Triangulo(int a, int b, int c) throws TrianguloException {
        if (esTriangulo(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            StringBuilder builder = new StringBuilder("Triángulo no válido ");
            builder.append(a).append('-').append(b).append('-').append(c);
            throw new TrianguloException(builder.toString());
        }
    }

    private static  boolean esTriangulo(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangulo{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(esTriangulo(1,1,0));
    }
}
