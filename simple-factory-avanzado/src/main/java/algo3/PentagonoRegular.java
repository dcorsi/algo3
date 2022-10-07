package algo3;

public class PentagonoRegular extends PoligonoRegular {

    public PentagonoRegular() {
        setNombre("Pentagono regular");
    }

    @Override
    public double calcularArea() {
        return 5 * getLado() * getLado() / (4 * Math.tan(Math.PI / 5.0));
    }
}
