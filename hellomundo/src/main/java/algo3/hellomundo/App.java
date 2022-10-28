package algo3.hellomundo;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Modelo modelo = new Modelo();
		Vista vista = new Vista(stage, modelo);
		Controlador controlador = new Controlador(modelo, vista);
		controlador.iniciar();
	}

	public static void main(String[] args) {
		launch();
	}
}
