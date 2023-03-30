package teoria.excepcionesPropias;

import java.util.Objects;

public class TrianguloRectangulo implements Comparable<TrianguloRectangulo> {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;

    public TrianguloRectangulo(
            double cateto1, double cateto2, double hipotenusa) throws TrianguloRectanguloException {
        if (comprabacionTrianguloRectangulo(cateto1, cateto2, hipotenusa)) {
            this.cateto1 = cateto1;
            this.cateto2 = cateto2;
            this.hipotenusa = hipotenusa;
        } else {
            throw new TrianguloRectanguloException(
                    String.format("No se puede crear un triángulo rectángulo con los valores %.2f, %.2f y %.2f%n",
                            cateto1, cateto2, hipotenusa));

        }

    }

    public double getCateto1() {
        return cateto1;
    }


    public double getCateto2() {
        return cateto2;
    }


    public double getHipotenusa() {
        return hipotenusa;
    }


    private double getArea() {
        return cateto1 * cateto2 / 2;
    }

    private static boolean comprabacionTrianguloRectangulo(
            double cateto1, double cateto2, double hipotenusa) {
        return !(cateto1 == 0 || cateto2 == 0 || hipotenusa == 0 ||
                !(Math.hypot(cateto1, cateto2) == hipotenusa));
    }

    @Override
    public String toString() {
        return String.format("cateto1 %.2f, cateto2 %.2f, hipotenusa %.2f",
                cateto1, cateto2, hipotenusa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrianguloRectangulo that = (TrianguloRectangulo) o;
        return Double.compare(that.cateto1, cateto1) == 0 && Double.compare(that.cateto2, cateto2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cateto1, cateto2);
    }

    @Override
    public int compareTo(TrianguloRectangulo trianguloRectangulo) {
        return (int) (this.getArea() * 1_000 -
                trianguloRectangulo.getArea() * 1_000);
    }
}
