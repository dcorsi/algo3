package algo3;

public class TrianguloEquilatero extends PoligonoRegular {

    public TrianguloEquilatero() {
        setNombre("Triangulo equilatero");
    }

    @Override
    public double calcularArea() {
        return getLado() * getLado() * Math.sqrt(3) / 4;
    }
}
