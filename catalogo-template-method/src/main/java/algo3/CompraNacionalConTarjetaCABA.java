package algo3;

public class CompraNacionalConTarjetaCABA extends Compra {
	
	private double impuestoDeSellos;

	public CompraNacionalConTarjetaCABA(double monto) {
		super(monto);
	}

	@Override
	public void mostrarTitulo() {
		System.out.println("Compra nacional con tarjeta de credito CABA: " + getMonto());
	}

	@Override
	public void calcularImpuestos() {
		impuestoDeSellos = getMonto() * 0.012;
	}

	@Override
	public void mostrarImpuestos() {
		System.out.println("Impuesto de sellos (1.2%): " + impuestoDeSellos);
	}

	@Override
	public void sumarImpuestos() {
		setImpuestos(impuestoDeSellos);
	}
}
