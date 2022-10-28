package algo3.demo1;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Vista {

    private Button b;
    private Menu m;
    private MenuBar mB;
    private MenuItem mI;
    private FlowPane f;
    private Scene s;

    public Vista(Stage stage) {
        
        b = new Button();
        mI = new MenuItem();
        m = new Menu();
        mB = new MenuBar();
        f = new FlowPane();
        
        b.setText("Haga clic aquí");
        b.setStyle("-fx-background-color: green;");

        mI.setText("Salir");
        
        m.setText("Archivo");
        m.getItems().add(mI);

        mB.getMenus().add(m);
        mB.setPrefWidth(300);

        f.getChildren().addAll(mB, b);
        
        f.setStyle("-fx-background-color: cyan;");
        f.setAlignment(Pos.TOP_CENTER);
        f.setVgap(4.0);
        f.setHgap(1.0);
        
        s = new Scene(f, 300, 150);
        
        stage.setScene(s);
        stage.setTitle("Demo 1");
//        stage.setResizable(false);
        stage.show();
    }
}
