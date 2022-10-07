package patos;

public class IncapacidadDeVuelo implements CapazDeVolar {

    @Override
    public void volar() {
        System.out.println("Pato incapaz de volar...");
    }
}
