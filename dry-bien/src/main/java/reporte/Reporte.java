package reporte;

public class Reporte {

	private double debito;
	private double credito;
	private double saldo;
	
	public Reporte(double debito, double credito) {
		this.debito = debito;
		this.credito = credito;
		this.saldo = credito - debito;
	}

	public void imprimir() {
		System.out.printf(" Debito: %10.2f\n", debito);
		System.out.printf("Credito: %10.2f\n", credito);
		if (saldo < 0)
			System.out.printf("  Saldo: %10.2f-\n", -saldo);
		else
			System.out.printf("  Saldo: %10.2f\n", saldo);
		}
}
