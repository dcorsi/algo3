package algo3;

public class OffState implements PossibleState {

	public String toString() {
		return "Televisor apagado.";
	}

	public void pressOffButton(Television tvContext) {
		System.out.println("El televisor sigue apagado.");
	}

	public void pressMuteButton(Television tvContext) {
		System.out.println("El televisor va a seguir apagado.");
	}

	public void pressOnButton(Television tvContext) {
		System.out.println("El televisor estaba apagado. Se va a encender con audio.");
		tvContext.setCurrentState(new OnState());
	}
}