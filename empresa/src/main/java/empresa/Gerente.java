package empresa;

public class Gerente extends Empleado {
	private double adicional;

	public Gerente() {
		adicional = 50000;
	}

	public double obtenerSueldo() {
		return super.obtenerSueldo() + adicional;
	}
}

