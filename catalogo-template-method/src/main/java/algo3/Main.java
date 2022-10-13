package algo3;

public class Main {

	public static void main(String[] args) {
		
		double monto = 10000;

		Compra compraNacionalConTarjetaCABA = new CompraNacionalConTarjetaCABA(monto);
		compraNacionalConTarjetaCABA.mostrarInforme();

		System.out.println();

		Compra compraInternacionalConTarjetaCABA = new CompraInternacionalConTarjetaCABA(monto);
		compraInternacionalConTarjetaCABA.mostrarInforme();
	}
}

