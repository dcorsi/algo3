package algo3.demo6;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Vista {

    private Button b[];
    private GridPane g;
    private ColumnConstraints c[];
    private Scene s;

    private final int columns = 3;
    
    public Vista(Stage stage) {

        b = new Button[4];
        g = new GridPane();
        c = new ColumnConstraints[columns];

        for (int i = 0; i < columns; i++) {
            c[i] = new ColumnConstraints();
            c[i].setPercentWidth(100.0 / columns);
            g.getColumnConstraints().add(c[i]);
        }

        for (int i = 0; i < 4; i++) {
            b[i] = new Button(Integer.toString(i + 1));
            if(i != 2) {
                b[i].prefWidthProperty().bind(g.widthProperty());
                b[i].prefHeightProperty().bind(g.heightProperty());
            }
        }

        GridPane.setConstraints(b[0], 0, 0, 1, 2, HPos.CENTER, VPos.CENTER);
        GridPane.setConstraints(b[1], 1, 0, 1, 1, HPos.CENTER, VPos.CENTER);
        GridPane.setConstraints(b[2], 2, 0, 1, 1, HPos.CENTER, VPos.CENTER);
        GridPane.setConstraints(b[3], 1, 1, 2, 1, HPos.CENTER, VPos.CENTER);

        g.getChildren().addAll(b[0], b[1], b[2], b[3]);

        s = new Scene(g, 400, 200);

        stage.setScene(s);
        stage.setTitle("Demo 6");
        stage.show();
    }

}
