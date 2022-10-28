package algo3.hellomundo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controlador {

	private Modelo modelo;
	private Vista vista;

	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar() {
		vista.registrarEscucha(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String nombre = vista.obtenerNombre();
				modelo.actualizarNombre(nombre);
				String saludo = modelo.generarSaludo();
				vista.mostrarSaludo(saludo);
			}
		});
	}
}
