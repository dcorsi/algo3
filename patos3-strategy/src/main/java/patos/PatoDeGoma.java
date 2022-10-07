package patos;

public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        setCapacidadDeVoz(new CapacidadDeVozArtificial());
        setCapacidadDeNado(new CapacidadDeNado());
        setCapacidadDeVuelo(new IncapacidadDeVuelo());
    }

    @Override
    public void mostrar() {
        System.out.println("Se muestra un pato de goma.");
    }
}
