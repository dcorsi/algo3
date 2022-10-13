package algo3;

public class MotoNaftera extends Moto {

	public MotoNaftera(String modelo, double potencia) {
		super(modelo, potencia);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Moto NAFTERA modelo: " + getModelo() + ". "
		+ "Potencia: " + getPotencia() + " HP.");
	}
}
