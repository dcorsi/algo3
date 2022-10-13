package algo3;

public abstract class Moto {
	private String modelo;
	private double potencia;

	public Moto(String modelo, double potencia) {
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public abstract void mostrarCaracteristicas();
}
