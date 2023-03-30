package teoria.excepcionesPropias;

public class Test {
    public static void main(String[] args) {
        TrianguloRectangulo t1 = null, t2 = null;
        try {
            t1 = new TrianguloRectangulo(1,1,1);
            System.out.printf("Triangulo %s%n", t1);
        } catch (TrianguloRectanguloException e) {
            //throw new RuntimeException(e);
            System.out.printf(e.getMessage());
        }
        try {
            t2 = new TrianguloRectangulo(3,4,5);
            System.out.printf("Triangulo %s%n", t2);
        } catch (TrianguloRectanguloException e) {
//            throw new RuntimeException(e);
            System.out.printf(e.getMessage());
        }

    }
}
