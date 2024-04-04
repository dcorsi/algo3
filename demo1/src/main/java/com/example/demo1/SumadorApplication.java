package com.example.demo1;


import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SumadorApplication extends Application {

    @Override
    public void start(Stage escenario) {
        TextField numero1 = new TextField();
        Label labelOperacion = new Label(" más ");
        TextField numero2 = new TextField();
        Button botonCalcular = new Button(" es igual a ");
        TextField resultado = new TextField();
        FlowPane gestorDeLayout = new FlowPane();
        gestorDeLayout.getChildren().add(numero1);
        gestorDeLayout.getChildren().add(labelOperacion);
        gestorDeLayout.getChildren().add(numero2);
        gestorDeLayout.getChildren().add(botonCalcular);
        gestorDeLayout.getChildren().add(resultado);
        Scene escenaPrincipal = new Scene(gestorDeLayout, 600, 50);
        escenario.setScene(escenaPrincipal);
        escenario.setTitle("Sumador");
        escenario.setResizable(false);
        escenario.show();
        botonCalcular.setOnAction(event -> {
            float n1 = Float.parseFloat(numero1.getText());
            float n2 = Float.parseFloat(numero2.getText());
            float resu = n1 + n2;
            resultado.setText(Float.toString(resu));
        });
    }

    public static void main(String[] args) {
        launch();
    }
}