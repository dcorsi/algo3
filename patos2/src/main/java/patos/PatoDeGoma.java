package patos;

public class PatoDeGoma extends Pato implements CapazDeParpar, CapazDeNadar {

    @Override
    public void mostrar() {
        System.out.println("Se muestra un pato de goma.");
    }

    @Override
    public void parpar() {
        System.out.println("<sonido artificial de pato >");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando...");
    }
}
