package algo3.demo4;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Vista {

    private Button b1, b2, b3;
    private VBox vb;
    private Scene s;

    public Vista(Stage stage) {

        b1 = new Button("Botón 1");
        b2 = new Button("Botón 2");
        b3 = new Button("Botón 3");
        vb = new VBox();

        vb.getChildren().addAll(b1, b2, b3);

        s = new Scene(vb, 400, 150);
        
        stage.setScene(s);
        stage.setTitle("Demo 4");
        stage.show();
    }
}

