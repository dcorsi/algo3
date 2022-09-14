package empresa;

public class Main {
	public static void main(String[] args) {
		Empleado cadete = new Empleado();
		System.out.println("Cadete: $" + cadete.obtenerSueldo());
		Gerente gerente = new Gerente();
		System.out.println("Gerente: $" + gerente.obtenerSueldo());
	}
}
