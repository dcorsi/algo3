package claseAbstracta;

public class Cuadrado extends PoligonoRegular {
	public Cuadrado(double lado) {
		super(lado);
	}

	public double calcularArea() {
		return getLado() * getLado();
	}
}
