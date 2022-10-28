package algo3.demo3;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Vista {

    private Button b1, b2, b3;
    private FlowPane f;
    private Scene s;

    public Vista(Stage stage) {

        b1 = new Button("Botón 1");
        b2 = new Button("Botón 2");
        b3 = new Button("Botón 3");
        f = new FlowPane();

        f.getChildren().addAll(b1, b2, b3);
        
        s = new Scene(f, 400, 150);
        stage.setScene(s);
        stage.setTitle("Demo 3");
        stage.show();
    }
}

