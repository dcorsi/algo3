package impura2;

public class Main {

	private static boolean yaUsada;

	public static void main(String[] args) {
		yaUsada = false;

		if (yaUsada)
			System.out.println("La funcion ya fue usada.");
		else
			System.out.println("La funcion aun no fue usada.");
		
		int x = 5;
		System.out.println("El sucesor de " + x + " es " + sucesor(x));

		if (yaUsada)
			System.out.println("La funcion ya fue usada.");
		else
			System.out.println("La funcion aun no fue usada.");
	}

	private static int sucesor(int x) {
		final int UNO = 1;
		yaUsada = true;
		return x + UNO;
	}
}


