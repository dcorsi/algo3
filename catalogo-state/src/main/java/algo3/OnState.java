package algo3;

public class OnState implements PossibleState {

	public String toString() {
		return "Televisor encendido con audio.";
	}

	public void pressOnButton(Television tvContext) {
		System.out.println("El televisor sigue encendido con audio.");
	}

	public void pressMuteButton(Television tvContext) {
		System.out.println("El televisor estaba encendido con audio. Se va a desactivar el audio.");
		tvContext.setCurrentState(new MuteState());
	}

	public void pressOffButton(Television tvContext) {
		System.out.println("El televisor estaba encendido con audio. Se va a apagar.");
		tvContext.setCurrentState(new OffState());
	}
}