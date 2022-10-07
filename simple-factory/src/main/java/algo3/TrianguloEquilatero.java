package algo3;

public class TrianguloEquilatero extends PoligonoRegular {

    public TrianguloEquilatero(double lado) {
        super(lado);
        setNombre("Triangulo equilatero");
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado() * Math.sqrt(3) / 4;
    }
}
