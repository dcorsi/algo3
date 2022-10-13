package algo3;

public class ProductoPorUnidad implements Elemento {

	private double precioUnitario;
	private String denominacion;

	public ProductoPorUnidad(String denominacion, double precioUnitario) {
		this.precioUnitario = precioUnitario;
		this.denominacion = denominacion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public double accept(VisitanteCalculoDeCosto visitante) {
		return visitante.visitar(this);
	}
}

