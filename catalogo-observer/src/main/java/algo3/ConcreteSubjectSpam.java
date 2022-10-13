package algo3;

// 1) Stores state of interest to ConcreteObserver objects.
// 2) Sends a notification to its observers when its state changes.

public class ConcreteSubjectSpam extends ObservableSubject {
	private String mensajeSpam;

	public String getMensajeSpam() {
		return mensajeSpam;
	}

	public void setMensajeSpam(String mensajeSpam) {
		this.mensajeSpam = mensajeSpam;
		notificarObservers();
	}
}
