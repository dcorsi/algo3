package excepciones;

import java.io.FileNotFoundException;

public class Alumno {

    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void sonreir() {
        int x = 1 / 0;
    }

    public void llorar() throws FileNotFoundException {
        java.io.FileReader fileReader = new java.io.FileReader("noexiste.fil");
    }
}
