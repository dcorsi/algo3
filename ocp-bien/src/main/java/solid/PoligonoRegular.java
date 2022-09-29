package solid;

public abstract class PoligonoRegular {

    private String Nombre;
    private double lado;

    public PoligonoRegular(String Nombre, double lado) {
        this.Nombre = Nombre;
        this.lado = lado;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getLado() {
        return lado;
    }

    public abstract double calcularArea();
    
}
