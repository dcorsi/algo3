package cuadrado;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		Function<Integer, Integer> cuadrado = x -> x * x;

		Function<Integer, Integer> cubo = x -> x * x * x;

		Function<Integer, Integer> func;

		func = cuadrado;
		System.out.println("3 al cuadrado = " + func.apply(3));

		func = cubo;
		System.out.println("3 al cubo = " + func.apply(3));
	}
}

