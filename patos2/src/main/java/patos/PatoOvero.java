package patos;

public class PatoOvero extends Pato implements CapazDeParpar, CapazDeNadar, CapazDeVolar {

    @Override
    public void mostrar() {
        System.out.println("Se muestra un pato overo.");
    }

    @Override
    public void parpar() {
        System.out.println("Cua, cua!");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando...");
    }

    @Override
    public void volar() {
        System.out.println("Pato volando...");
    }
}
