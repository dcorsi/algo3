package com.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage escenario;

    private static Modelo modelo;

    public static void setStageTitle(String titulo) {
        escenario.setTitle(titulo);
    }

    public static Modelo getModelo() {
        return modelo;
    }

    @Override
    public void start(Stage stage) throws IOException {
        escenario = stage;
        modelo = new Modelo();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("vista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}