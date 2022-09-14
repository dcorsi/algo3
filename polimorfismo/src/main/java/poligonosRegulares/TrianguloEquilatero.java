package poligonosRegulares;

public class TrianguloEquilatero extends PoligonoRegular {

	private double lado;
	
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public void mostrarArea() {
        System.out.printf ("Area del triangulo equilatero: %5.2f%n", lado*lado*Math.sqrt(3)/4);
    }
}
