package algo3.demo2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Vista {

    private Button b1, b2, b3, b4, b5;
    private BorderPane bp;
    private Scene s;

    public Vista(Stage stage) {
        b1 = new Button("TOP");
        b2 = new Button("LEFT");
        b3 = new Button("RIGHT");
        b4 = new Button("BOTTOM");
        b5 = new Button("CENTER");
        bp = new BorderPane();

        b1.prefWidthProperty().bind(bp.widthProperty());
        b2.prefHeightProperty().bind(bp.heightProperty());
        b3.prefHeightProperty().bind(bp.heightProperty());
        b4.prefWidthProperty().bind(bp.widthProperty());
        b5.prefHeightProperty().bind(bp.heightProperty());
        b5.prefWidthProperty().bind(bp.widthProperty());

        bp.setTop(b1);
        bp.setLeft(b2);
        bp.setRight(b3);
        bp.setBottom(b4);
        bp.setCenter(b5);
        
        s = new Scene(bp, 400, 150);
        
        stage.setScene(s);
        stage.setMinHeight(150);
        stage.setMinWidth(400);
        stage.setTitle("Demo 2");
        stage.show();
    }
}
