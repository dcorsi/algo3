package inmutable;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);

		ArrayList<Integer> nuevosNumeros= (ArrayList<Integer>) numeros.stream().map(value -> value + 1).collect(Collectors.toList());
		
		System.out.println(numeros);
		System.out.println(nuevosNumeros);
	}
}

