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

    private void reportar(String etiqueta, double valor) {
    	System.out.printf(etiqueta + ": %10.2f" + (valor < 0 ? "-" : "") + "\n", Math.abs(valor));
    }
    
	public void imprimir() {
		reportar(" Debito", debito);
		reportar("Credito", credito);
		reportar("  Saldo", saldo);
	}
}
