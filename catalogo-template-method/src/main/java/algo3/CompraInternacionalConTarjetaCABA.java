package algo3;

public class CompraInternacionalConTarjetaCABA extends Compra {

	private double impuestoPAIS;
	private double percepcionRG4815;
	private double impuestoDeSellos;

	public CompraInternacionalConTarjetaCABA(double monto) {
		super(monto);
	}

	@Override
	public void mostrarTitulo() {
		System.out.println("Compra internacional con tarjeta de credito CABA: " + getMonto());
	}

	@Override
	public void calcularImpuestos() {
		impuestoPAIS = getMonto() * 0.3;
		percepcionRG4815 = getMonto() * 0.45;
		impuestoDeSellos = getMonto() * 0.012;
	}

	@Override
	public void mostrarImpuestos() {
		System.out.println("Impuesto PAIS (30%): " + impuestoPAIS);
		System.out.println("Percepcion RG 4815 (45%): " + percepcionRG4815);
		System.out.println("Impuesto de sellos (1.2%): " + impuestoDeSellos);
	}

	@Override
	public void sumarImpuestos() {
		setImpuestos(impuestoPAIS + percepcionRG4815 + impuestoDeSellos);
	}
}

