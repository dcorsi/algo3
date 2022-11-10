package ieee754;

public class Main {

	public static void main(String[] args) {
		float numero = 0f;
		System.out.println("       Float: " + numero);
		System.out.println("IEEE-754 Bin: " + ieee754bin(numero));
		System.out.println("IEEE-754 Hex: " + ieee754hex(numero));
	}

	public static String ieee754bin(float numero) {
		return signo(numero) + exponente(numero) + mantisa(numero);
	}

	public static String ieee754hex(float numero) {
		String binario = ieee754bin(numero);
		long decimal = Long.parseLong(binario, 2);
		String cadena = Long.toHexString(decimal);
		return String.format("%1$" + 8 + "s", cadena).replace(' ', '0');
	}

	private static String signo(float numero) {
		int intBits = Float.floatToIntBits(numero);
		int sign = intBits & 0x80000000;
		return Integer.toBinaryString(sign).substring(0, 1);
	}

	private static String exponente(float numero) {
		int intBits = Float.floatToIntBits(numero);
		int exponent = intBits & 0x7f800000;
		String cadena = Integer.toBinaryString(exponent);
		return String.format("%1$" + 8 + "s", cadena).replace(' ', '0').substring(0, 8);
	}

	private static String mantisa(float numero) {
		int intBits = Float.floatToIntBits(numero);
		int mantissa = intBits & 0x007fffff;
		String cadena = Integer.toBinaryString(mantissa);
		return String.format("%1$" + 23 + "s", cadena).replace(' ', '0').substring(0, 23);
	}
}

