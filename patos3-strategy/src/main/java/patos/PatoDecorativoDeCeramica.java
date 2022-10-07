package patos;

public class PatoDecorativoDeCeramica extends Pato {

    public PatoDecorativoDeCeramica() {
        setCapacidadDeVoz(new IncapacidadDeVoz());
        setCapacidadDeNado(new IncapacidadDeNado());
        setCapacidadDeVuelo(new IncapacidadDeVuelo());
    }

    @Override
    public void mostrar() {
        System.out.println("Se muestra un pato decorativo de ceramica.");
    }
}
