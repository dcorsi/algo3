package algo3;

public abstract class Auto {
	private String modelo;
	private double potencia;
	private double capacidadDelBaul;

	public Auto(String modelo, double potencia, double capacidadDelBaul) {
		this.modelo = modelo;
		this.potencia = potencia;
		this.capacidadDelBaul = capacidadDelBaul;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public double getCapacidadDelBaul() {
		return capacidadDelBaul;
	}

	public abstract void mostrarCaracteristicas();
}
