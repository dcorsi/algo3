package patos;

public class PatoCapuchino extends Pato {

    public PatoCapuchino() {
        setCapacidadDeVoz(new CapacidadDeVozNatural());
        setCapacidadDeNado(new CapacidadDeNado());
        setCapacidadDeVuelo(new CapacidadDeVuelo());
    }

    @Override
    public void mostrar() {
        System.out.println("Se muestra un pato capuchino.");
    }
}
