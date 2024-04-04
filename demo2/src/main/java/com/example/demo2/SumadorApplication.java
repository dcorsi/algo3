package com.example.demo2;

import javafx.application.Application;
import javafx.stage.Stage;

public class SumadorApplication extends Application {

    @Override
    public void start(Stage stage) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista(stage, modelo);
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }

    public static void main(String[] args) {
        launch();
    }
}
