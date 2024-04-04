package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Vista {
    private TextField textFieldNumero1;
    private Label labelOperacion;
    private TextField textFieldNumero2;
    private Button botonCalcular;
    private TextField textFieldResultado;
    private FlowPane gestorDeLayout;
    private Scene escenaPrincipal;

    private Modelo modelo;

    public Vista(Stage escenario, Modelo modelo) {
        this.modelo = modelo;
        textFieldNumero1 = new TextField();
        labelOperacion = new Label(modelo.obtenerPrimerTextoDeApp());
        textFieldNumero2 = new TextField();
        botonCalcular = new Button(modelo.obtenerSegundoTextoDeApp());
        textFieldResultado = new TextField();
        gestorDeLayout = new FlowPane();
        gestorDeLayout.getChildren().add(textFieldNumero1);
        gestorDeLayout.getChildren().add(labelOperacion);
        gestorDeLayout.getChildren().add(textFieldNumero2);
        gestorDeLayout.getChildren().add(botonCalcular);
        gestorDeLayout.getChildren().add(textFieldResultado);
        escenaPrincipal = new Scene(gestorDeLayout, 600, 50);
        escenario.setScene(escenaPrincipal);
        escenario.setTitle(modelo.obtenerTituloDeApp());
        escenario.setResizable(false);
        escenario.show();
    }

    public float obtenerNumero1() {
        return Float.parseFloat(textFieldNumero1.getText());
    }

    public float obtenerNumero2() {
        return Float.parseFloat(textFieldNumero2.getText());
    }

    public void mostrarResultado(float resu){
        textFieldResultado.setText(Float.toString(resu));
    }

    public void agregarAlgoritmoParaCalcular(EventHandler<ActionEvent> handler) {
        botonCalcular.setOnAction(handler);
    }
}

