package patos;

public abstract class Pato {

    private CapazDeParpar capacidadDeVoz;
    private CapazDeNadar capacidadDeNado;
    private CapazDeVolar capacidadDeVuelo;

    public void setCapacidadDeVoz(CapazDeParpar capacidadDeVoz) {
        this.capacidadDeVoz = capacidadDeVoz;
    }

    public void setCapacidadDeNado(CapazDeNadar capacidadDeNado) {
        this.capacidadDeNado = capacidadDeNado;
    }

    public void setCapacidadDeVuelo(CapazDeVolar capacidadDeVuelo) {
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    public void parpar() {
        capacidadDeVoz.parpar();
    }

    public void nadar() {
        capacidadDeNado.nadar();
    }

    public void volar() {
        capacidadDeVuelo.volar();
    }

    public abstract void mostrar();
}
