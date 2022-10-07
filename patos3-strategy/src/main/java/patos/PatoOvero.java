package patos;

public class PatoOvero extends Pato {

    public PatoOvero() {
        setCapacidadDeVoz(new CapacidadDeVozNatural());
        setCapacidadDeNado(new CapacidadDeNado());
        setCapacidadDeVuelo(new CapacidadDeVuelo());
    }

    @Override
    public void mostrar() {
        System.out.println("Se muestra un pato overo.");
    }
}
