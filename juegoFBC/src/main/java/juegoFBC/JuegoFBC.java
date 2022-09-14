package juegoFBC;

public class JuegoFBC {

	private Barril barril;
	private Jugador jugador1;
	private Jugador jugador2;

	public JuegoFBC(int capacidadDelBarril) {
		barril = new Barril(capacidadDelBarril);
		jugador1 = new Jugador(1);
		jugador2 = new Jugador(2);
	}

	public void jugar() {
		while (barril.hayDemasiadaCerveza()) {
			jugador1.beber(barril);
			if (barril.hayGanador()) {
				jugador1.cantarVictoria();
			} else if (barril.hayPerdedor()) {
				jugador2.cantarVictoria();
			} else {
				jugador2.beber(barril);
				if (barril.hayGanador()) {
					jugador2.cantarVictoria();
				} else if (barril.hayPerdedor()) {
					jugador1.cantarVictoria();
				}
			}
		}
	}
}


