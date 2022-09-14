package poligonosRegulares;

public class PentagonoRegular extends PoligonoRegular {

	private double lado;
	
    public PentagonoRegular(double lado) {
        this.lado = lado;
    }

    @Override
    public void mostrarArea() {
        System.out.printf ("Area del pentagono regular: %5.2f%n", 5*lado*lado/(4*Math.tan(Math.PI/5.0)));
    }
}
