package pura;

public class Main {

	public static void main(String[] args) {
		int x = 5;
		System.out.println("El sucesor de " + x + " es " + sucesor(x));
	}

	private static int sucesor(int x) {
		final int UNO = 1;
		return x + UNO;
	}
}

