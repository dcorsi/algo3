package algo3.hellomundo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Vista {
	private TextField campoNombre;
	private TextField campoSaludo;
	private Button botonSaludar;
	private FlowPane gestorDeLayout;
	private Scene escenaPrincipal;

	public Vista(Stage escenario, Modelo modelo) {
		campoNombre = new TextField();
		campoSaludo = new TextField();
		botonSaludar = new Button(modelo.getDescripcionDeAccion());
		gestorDeLayout = new FlowPane();
		gestorDeLayout.getChildren().add(campoNombre);
		gestorDeLayout.getChildren().add(botonSaludar);
		gestorDeLayout.getChildren().add(campoSaludo);
		escenaPrincipal = new Scene(gestorDeLayout);
		escenario.setScene(escenaPrincipal);
		escenario.setWidth(400);
		escenario.setHeight(120);
		escenario.setTitle(modelo.getTituloDeApp());
		escenario.setResizable(false);
		escenario.show();
	}

	public void registrarEscucha(EventHandler<ActionEvent> eventHandler) {
		botonSaludar.setOnAction(eventHandler);
	}

	public String obtenerNombre() {
		return campoNombre.getText();
	}

	public void mostrarSaludo(String saludo) {
		campoSaludo.setText(saludo);
	}
}

