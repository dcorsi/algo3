package algo3;

public class Main {

	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();

		System.out.println("Hashcode de o1: " + o1.hashCode());
		System.out.println("Hashcode de o2: " + o2.hashCode());
		System.out.println("Hashcode de o3: " + o3.hashCode());

		if (o1 == o2 && o2 == o3) {
			System.out.println("Las variables o1, o2 y o3 se refieren al mismo objeto.");
		} else {
			System.out.println("Las variables o1, o2 y o3 NO se refieren al mismo objeto.");
		}

		System.out.println();

		ColaDeImpresion s1 = ColaDeImpresion.getInstance();
		ColaDeImpresion s2 = ColaDeImpresion.getInstance();
		ColaDeImpresion s3 = ColaDeImpresion.getInstance();

		System.out.println("Hashcode de s1: " + s1.hashCode());
		System.out.println("Hashcode de s2: " + s2.hashCode());
		System.out.println("Hashcode de s3: " + s3.hashCode());

		if (s1 == s2 && s2 == s3) {
			System.out.println("Las variables s1, s2 y s3 se refieren al mismo objeto.");
		} else {
			System.out.println("Las variables s1, s2 y s3 NO se refieren al mismo objeto.");
		}
	}
}
