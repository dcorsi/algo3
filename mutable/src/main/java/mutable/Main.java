package mutable;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);

		for (int i = 0; i < numeros.size(); i++) {
			numeros.set(i,  numeros.get(i) + 1);
		}
		
		System.out.println(numeros);
	}
}


