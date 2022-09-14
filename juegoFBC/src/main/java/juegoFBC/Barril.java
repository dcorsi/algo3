package juegoFBC;

public class Barril {

	private int contenido;

	public Barril(int contenido) {
		this.contenido = contenido;
	}

	public boolean hayDemasiadaCerveza() {
		return contenido > 1;
	}

	public boolean hayGanador() {
		return contenido == 1;
	}

	public boolean hayPerdedor() {
		return contenido == 0;
	}

	public boolean esImposibleBeber(int cantidad) {
		return cantidad < 1 || cantidad > 3 || cantidad > contenido;
	}

	public int calcularMaximoExtraible() {
		return (contenido > 2 ? 3 : contenido);
	}

	public void extraer(int cantidad) {
		contenido -= cantidad;
	}
}

