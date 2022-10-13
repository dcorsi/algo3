package algo3;

public class Mensaje implements MensajeAbstracto {

	private String texto;

	public Mensaje(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
}
