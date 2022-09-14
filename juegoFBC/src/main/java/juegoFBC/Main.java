package juegoFBC;

public class Main {
	public static final java.util.Scanner teclado = new java.util.Scanner(System.in);
	public static final java.io.PrintStream pantalla = new java.io.PrintStream(System.out);

	public static void main(String[] args) {
		JuegoFBC juegoFBC = new JuegoFBC(20);
		juegoFBC.jugar();
	}

}

