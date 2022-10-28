package algo3.hellomundo;

public class Modelo {

	private String nombre;
	private String tituloDeApp;
	private String descripcionDeAccion;

	public Modelo() {
		tituloDeApp = "MVC Demo";
		descripcionDeAccion = "Saludar";
	}

	public String getTituloDeApp() {
		return tituloDeApp;
	}
	
	public String getDescripcionDeAccion() {
		return descripcionDeAccion;
	}
	
	public void actualizarNombre(String nombre) {
		this.nombre = nombre;
	}

	public String generarSaludo() {
		return "Hola, " + nombre + "!";
	}
}

