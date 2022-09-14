package claseAbstracta;

public abstract class PoligonoRegular {
	private double lado;

	public PoligonoRegular(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public abstract double calcularArea();
}
