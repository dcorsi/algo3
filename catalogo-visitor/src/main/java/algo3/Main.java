package algo3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Elemento> elementos = new ArrayList<>();
		elementos.add(new ProductoPorUnidad("Mango", 349));
		elementos.add(new ProductoPorPeso(1.4, "Banana", 259));
		elementos.add(new ProductoPorUnidad("Palta", 239));
		elementos.add(new ProductoPorPeso(1.8, "Naranja", 119));

		VisitanteCalculoDeCosto visitante = new VisitanteConcretoCalculoDeCosto();
		double total = 0;
		for (Elemento elemento : elementos) {
			total += elemento.accept(visitante);
		}
		System.out.printf("Total: $%.2f", total);
	}
}


