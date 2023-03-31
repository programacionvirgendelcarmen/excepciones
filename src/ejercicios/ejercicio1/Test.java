package ejercicios.ejercicio1;


public class Test {
    public static void main(String[] args) {
        try {
            Triangulo t1 = new Triangulo(3, 4, 5);
            System.out.println(t1);
        } catch (TrianguloException e) {
            System.out.println(e.getMessage());
        }
        try {
            Triangulo t2 = new Triangulo(1, 1, 1);
            System.out.println(t2);
        } catch (TrianguloException e) {
            System.out.println(e.getMessage());
        }
        try {
            Triangulo t3 = new Triangulo(1, 1, 2);
            System.out.println(t3);
        } catch (TrianguloException e) {
            System.out.println(e.getMessage());
        }
    }
}
