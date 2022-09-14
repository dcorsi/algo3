package juegoFBC;

import static juegoFBC.Main.pantalla;
import static juegoFBC.Main.teclado;

public class Jugador {

	private String nombre;

	public Jugador(int numero) {
		do {
			pantalla.print("Jugador Nro. " + numero + ", ingrese su nombre: ");
			nombre = teclado.nextLine();
		} while (nombre.isBlank());
	}

	public void beber(Barril barril) {
		int tope = barril.calcularMaximoExtraible();
		int cantidad = decidirCantidadABeber(tope);
		while (barril.esImposibleBeber(cantidad)) {
			cantidad = decidirCantidadABeber(tope);
		}
		barril.extraer(cantidad);
	}

	private int decidirCantidadABeber(int tope) {
		pantalla.print(nombre + ", cuantas dosis de 500 ml vas a beber? (max. " + tope + "): ");
		String renglon = teclado.nextLine();
		int cantidad;
		try {
			cantidad = Integer.parseInt(renglon);
		} catch (Exception ex) {
			cantidad = 0;
		}
		return cantidad;
	}

	public void cantarVictoria() {
		pantalla.println(nombre + " es el vencedor! Vayan a comprar otro barril...");
	}
}




