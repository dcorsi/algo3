package algo3;

public class AutoElectrico extends Auto {

	public AutoElectrico(String modelo, double potencia, double capacidadDelBaul) {
		super(modelo, potencia, capacidadDelBaul);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Auto ELECTRICO modelo: " + getModelo() + ". "
			+ "Potencia: " + getPotencia() + " HP. "
			+ "Capacidad del baul: " + getCapacidadDelBaul() + " litros.");
	}
}
