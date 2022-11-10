package impura1;

public class Main {

	private static final int UNO = 1;

	public static void main(String[] args) {
		int x = 5;
		System.out.println("El sucesor de " + x + " es " + sucesor(x));
	}

	private static int sucesor(int x) {
		return x + UNO;
	}
}



