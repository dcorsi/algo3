package edades;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Persona> personas = new ArrayList<>();

		personas.add(new Persona("Juan", 20));
		personas.add(new Persona("Carolina", 23));
		personas.add(new Persona("Alicia", 40));
		personas.add(new Persona("Pablo", 25));

		AcumuladorDeEdades acumuladorDeEdades = new AcumuladorDeEdades();
		for (Persona persona : personas) {
			persona.sumarEdad(acumuladorDeEdades);
		}

		System.out.print("La edad promedio es: ");
		acumuladorDeEdades.mostrarPromedio(personas.size());
		System.out.println();
	}
}
