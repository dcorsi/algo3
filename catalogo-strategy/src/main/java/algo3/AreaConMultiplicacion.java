package algo3;

public class AreaConMultiplicacion implements EstrategiaParaCalcularArea {

	@Override
	public double calcularArea(int cantidadDeLados, double lado) {
		return lado * lado;
	}
}
