package compose;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {

		BiFunction<Double, Double, Double> suma = (x1, x2) -> x1 + x2;

		BiFunction<Double, Double, Double> potencia = (x1, x2) -> Math.pow(x1, x2);

		BiFunction<Double, Double, Double> sumaDePotencias = (x1, x2) -> suma.apply(potencia.apply(x1, x2),
				potencia.apply(x1, x2));

		BiFunction<Double, Double, Double> potenciaDeSuma = (x1, x2) -> potencia.apply(suma.apply(x1, x2),
				suma.apply(x1, x2));

		System.out.println("(2.0 ^ 3.0) + (2.0 ^ 3.0) = " + sumaDePotencias.apply(2.0, 3.0));
		System.out.println("(2.0 + 3.0) ^ (2.0 + 3.0) = " + potenciaDeSuma.apply(2.0, 3.0));
	}
}

