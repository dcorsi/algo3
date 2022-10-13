package algo3;

public abstract class Decorador implements MensajeAbstracto {

	private MensajeAbstracto mensaje;

	public Decorador(MensajeAbstracto mensaje) {
		this.mensaje = mensaje;
	}

	public String getTexto() {
		return mensaje.getTexto();
	}
}
