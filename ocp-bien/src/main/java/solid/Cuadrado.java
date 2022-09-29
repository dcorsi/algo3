package solid;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado) {
        super("Cuadrado", lado);
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }
}
