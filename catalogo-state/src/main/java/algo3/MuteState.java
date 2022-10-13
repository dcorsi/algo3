package algo3;

public class MuteState implements PossibleState {

	public String toString() {
		return "Televisor encendido sin audio.";
	}

	public void pressOnButton(Television tvContext) {
		System.out.println("El televisor sigue encendido sin audio.");
	}

	public void pressMuteButton(Television tvContext) {
		System.out.println("El televisor estaba encendido sin audio. Se va a activar el audio.");
		tvContext.setCurrentState(new OnState());
	}

	public void pressOffButton(Television tvContext) {
		System.out.println("El televisor estaba encendido sin audio. Se va a apagar.");
		tvContext.setCurrentState(new OffState());
	}
}