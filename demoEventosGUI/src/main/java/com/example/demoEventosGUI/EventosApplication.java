package com.example.demoEventosGUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EventosApplication extends Application {

    private double mouseX;
    private double mouseY;
    private double circleX;
    private double circleY;

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        TextArea textArea = new TextArea();
        textArea.setPrefSize(500, 300);
        textArea.setLayoutX(0);
        textArea.setLayoutY(0);

        Circle circle = new Circle(20, Color.RED);
        circle.setLayoutX(100);
        circle.setLayoutY(100);

        Label label = new Label("Los eventos aparecerán aquí.");
        label.setLayoutX(0);
        label.setLayoutY(300);

        // Manejo de eventos de teclado
        textArea.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            label.setText("Tecla presionada: " + event.getCode());
        });

        // Manejo de eventos de mouse
        textArea.addEventFilter(MouseEvent.MOUSE_PRESSED, event -> {
            label.setText("Mouse presionado en: " + event.getX() + ", " + event.getY());
        });

        textArea.addEventFilter(MouseEvent.MOUSE_RELEASED, event -> {
            label.setText("Mouse liberado en: " + event.getX() + ", " + event.getY());
        });

        // Eventos para arrastrar el círculo
        circle.setOnMousePressed(event -> {
            mouseX = event.getSceneX() - circle.getLayoutX();
            mouseY = event.getSceneY() - circle.getLayoutY();
        });

        circle.setOnMouseDragged(event -> {
            circleX = event.getSceneX() - mouseX;
            circleY = event.getSceneY() - mouseY;
            circle.setLayoutX(circleX);
            circle.setLayoutY(circleY);
            label.setText("Círculo arrastrado dentro del TextArea en: " + circleX + ", " + circleY);
        });

        // Evento para soltar el círculo
        circle.setOnMouseReleased(event -> {
            circleX = circle.getLayoutX();
            circleY = circle.getLayoutY();
            double textAreaX = textArea.getLayoutX();
            double textAreaY = textArea.getLayoutY();

            // Verifica si el círculo está dentro del área del TextArea
            if (circleX > textAreaX && circleX < textAreaX + textArea.getWidth() &&
                    circleY > textAreaY && circleY < textAreaY + textArea.getHeight()) {
                label.setText("Círculo soltado dentro del TextArea en: " + circleX + ", " + circleY);
            }
        });

        root.getChildren().addAll(textArea, circle, label);

        Scene scene = new Scene(root, 500, 320);
        primaryStage.setTitle("Ejemplo de Eventos en JavaFX");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        root.setBackground(Background.fill(Color.AQUAMARINE));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}