package algo3;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado) {
        super(lado);
        setNombre("Cuadrado");
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }
}
