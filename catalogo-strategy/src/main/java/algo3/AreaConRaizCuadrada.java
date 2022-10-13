package algo3;

public class AreaConRaizCuadrada implements EstrategiaParaCalcularArea {

	@Override
	public double calcularArea(int cantidadDeLados, double lado) {
		return lado * lado * Math.sqrt(3) / 4;
	}
}
