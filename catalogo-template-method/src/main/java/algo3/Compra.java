package algo3;

public abstract class Compra {
	
	private double monto;
	private double impuestos;

	public Compra(double monto) {
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public void mostrarInforme() {
		mostrarTitulo();
		calcularImpuestos();
		mostrarImpuestos();
		sumarImpuestos();
		mostrarTotal();
	}
	
	public abstract void mostrarTitulo();

	public abstract void calcularImpuestos();

	public abstract void sumarImpuestos();

	public abstract void mostrarImpuestos();

	private void mostrarTotal() {
		System.out.println("Valor a pagar: " + (monto + impuestos));
	}
}

