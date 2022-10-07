package patos;

public class PatoDeGoma extends Pato {

    @Override
    public void parpar() {
        System.out.println("<sonido artificial de pato>");
    }

    @Override
    public void mostrar() {
        System.out.println("Se muestra un pato de goma.");
    }
}
