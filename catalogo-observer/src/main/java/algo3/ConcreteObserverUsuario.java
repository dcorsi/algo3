package algo3;

// 1) Maintains a reference to a ConcreteSubject object.
// 2) Stores state that should stay consistent with the subject's.
// 3) Implements the Observer updating interface to keep its state consistent with the subject's.

public class ConcreteObserverUsuario implements Observer {
	private ConcreteSubjectSpam spam;
	private String mensajeSpamRecibido;
	private String nombre;

	public ConcreteObserverUsuario(String nombre, ConcreteSubjectSpam spam) {
		this.nombre = nombre;
		this.spam = spam;
		actualizarMensajeSpamRecibido();
	}

	public void actualizar() {
		actualizarMensajeSpamRecibido();
	}

	private void actualizarMensajeSpamRecibido() {
		mensajeSpamRecibido = spam.getMensajeSpam();
	}

	public void mostrar() {
		System.out.println("Estado de " + nombre + ": " + mensajeSpamRecibido);
	}
}

