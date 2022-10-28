package algo3.demo5;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Vista {

    private Button b[];
    private GridPane g;
    private Scene s;

    public Vista(Stage stage) {

        b = new Button[12];
        g = new GridPane();
        
        for (int i = 0; i < 12; i++) {
            b[i] = new Button(Character.toString("123456789*0#".charAt(i)));
            
            b[i].prefWidthProperty().bind(g.widthProperty());
            b[i].prefHeightProperty().bind(g.heightProperty());
            
            if(((i+1)%3)==0) {
                g.addRow((i/3), b[i-2],b[i-1],b[i]);
            }
        }
        
        s = new Scene(g, 200, 220);
        stage.setScene(s);
        stage.setTitle("Demo 5");
        stage.show();
    }
}