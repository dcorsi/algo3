package com.example.demo2;

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
        vista.agregarAlgoritmoParaCalcular(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                float n1 = vista.obtenerNumero1();
                float n2 = vista.obtenerNumero2();

                float resu = modelo.operar(n1, n2);
                vista.mostrarResultado(resu);
            }
        });
    }
}
