package algo3;

public class AutoNaftero extends Auto {

	public AutoNaftero(String modelo, double potencia, double capacidadDelBaul) {
		super(modelo, potencia, capacidadDelBaul);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Auto NAFTERO modelo: " + getModelo() + ". "
			+ "Potencia: " + getPotencia() + " HP. "
			+ "Capacidad del baul: " + getCapacidadDelBaul() + " litros.");
	}
}
