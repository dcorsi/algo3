package algo3;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado() {
        setNombre("Cuadrado");
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }
}
