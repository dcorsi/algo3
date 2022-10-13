package algo3;

public class ProductoPorPeso implements Elemento {

	private double precioPorKg;
	private double peso;
	private String denominacion;

	public ProductoPorPeso(double peso, String denominacion, double precioPorKg) {
		this.precioPorKg = precioPorKg;
		this.peso = peso;
		this.denominacion = denominacion;
	}

	public double getPrecioPorKg() {
		return precioPorKg;
	}

	public double getPeso() {
		return peso;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public double accept(VisitanteCalculoDeCosto visitante) {
		return visitante.visitar(this);
	}
}


