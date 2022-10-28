package algo3.demo10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        AdditionModel model = new AdditionModel();
        AdditionController controller = new AdditionController(model);
        AdditionView view = new AdditionView(controller, model);

        Scene scene = new Scene(view.asParent(), 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}