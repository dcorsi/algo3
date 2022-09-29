package edades;

public class AcumuladorDeEdades {

	private int valor;

	public AcumuladorDeEdades() {
		valor = 0;
	}

	public void sumar(int edad) {
		valor += edad;
	}

	public void mostrarPromedio(int cantidad) {
		System.out.print(valor / (float) cantidad);
	}
}
