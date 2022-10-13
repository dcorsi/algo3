package algo3;

public class AreaConTrigonometria implements EstrategiaParaCalcularArea {

	@Override
	public double calcularArea(int cantidadDeLados, double lado) {
		return cantidadDeLados * lado * lado / (4 * Math.tan(Math.PI / cantidadDeLados));
	}
}
