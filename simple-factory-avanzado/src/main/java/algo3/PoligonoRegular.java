package algo3;

public abstract class PoligonoRegular {

    private double lado;
    private String nombre;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
}
