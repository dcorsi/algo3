package algo3;

public class Television {
	private PossibleState currentState;

	public PossibleState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(PossibleState currentState) {
		this.currentState = currentState;
	}

	public Television() {
		this.currentState = new OffState();
	}

	public void executeOffButton() {
		System.out.println("Ud. ha presionado Off.");
		currentState.pressOffButton(this);
	}

	public void executeOnButton() {
		System.out.println("Ud. ha presionado On.");
		currentState.pressOnButton(this);
	}

	public void executeMuteButton() {
		System.out.println("Ud. ha presionado Mute.");
		currentState.pressMuteButton(this);
	}
}