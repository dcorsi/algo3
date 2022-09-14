package poligonosRegulares;

public class Cuadrado extends PoligonoRegular {

	private double lado;
	
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void mostrarArea() {
        System.out.printf ("Area del cuadrado: %5.2f%n",  lado*lado);
    }
}
