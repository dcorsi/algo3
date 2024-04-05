package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private Label resultadoText;

    @FXML
    private TextField entradaText;

    @FXML
    private Button operarBtn;

    private Modelo modelo;

    public void initialize(){
        this.modelo = new Modelo();
        Main.setStageTitle(modelo.obtenerNombreApp());
        operarBtn.setText(modelo.obtenerNombreOp());
    }

    @FXML
    protected void onOperarButtonClick() {
        float num = Float.parseFloat(entradaText.getText());
        float resu = modelo.operar(num);
        resultadoText.setText(Float.toString(resu));
    }
}