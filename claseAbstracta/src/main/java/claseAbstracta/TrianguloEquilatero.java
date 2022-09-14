package claseAbstracta;

public class TrianguloEquilatero extends PoligonoRegular {
	public TrianguloEquilatero(double lado) {
		super(lado);
	}

	public double calcularArea() {
		return getLado() * getLado() * Math.sqrt(3) / 4;
	}
}
