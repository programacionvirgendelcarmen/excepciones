package teoria.noDeclarativas.noSeguras;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Nulos {
    private static List<Persona> lista = new ArrayList<>();

    public static void main(String[] args) {

        lista.add(new Persona("juan", 1));
        lista.add(new Persona("luisa", 2));
        lista.add(new Persona("felipe", 3));
        lista.add(new Persona("manuel", 4));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un id");
        int id = scanner.nextInt();
        Persona personaID = new Persona("", id);
        Persona personaBuscar = buscar(personaID);
        System.out.println("Encontrada siguiente persona: ");
        System.out.println(personaBuscar.getNombre().toUpperCase());

    }

    private static Persona buscar(Persona personaID) {
        Persona personaBuscar = null;
        for (Persona persona : lista) {
            if (persona.equals(personaID))
                return persona;
        }
        return personaBuscar;
    }


}
class Persona {
    private String nombre;
    private int id;

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%S-%d", nombre, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
