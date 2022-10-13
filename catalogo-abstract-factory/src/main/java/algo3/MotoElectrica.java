package algo3;

public class MotoElectrica extends Moto {

	public MotoElectrica(String modelo, double potencia) {
		super(modelo, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Moto ELECTRICA modelo: " + getModelo() + ". "
		+ "Potencia: " + getPotencia() + " HP.");
	}
}
