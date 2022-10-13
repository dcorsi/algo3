package algo3;

public class VisitanteConcretoCalculoDeCosto implements VisitanteCalculoDeCosto {

	public double visitar(ProductoPorUnidad producto) {
		double costo = producto.getPrecioUnitario();
		System.out.printf("1 %s: $%.2f (precio por unidad)\n", producto.getDenominacion(), costo);
		return costo;
	}

	public double visitar(ProductoPorPeso producto) {
		double costo = producto.getPeso() * producto.getPrecioPorKg();
		System.out.printf("%.2f Kg de %s a $%.2f/Kg: $%.2f\n", producto.getPeso(), producto.getDenominacion(),
			producto.getPrecioPorKg(), costo);
		return costo;
	}
}

