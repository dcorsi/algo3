package edades;

public class Persona {
	private final String nombre;
	private final int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void sumarEdad(AcumuladorDeEdades edadTotal) {
		edadTotal.sumar(edad);
	}
}
