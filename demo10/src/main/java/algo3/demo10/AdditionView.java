package algo3.demo10;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class AdditionView {
    private GridPane view ;
    private TextField xField;
    private TextField yField;
    private Label sumLabel;

    private AdditionController controller ;
    private AdditionModel model ;

    public AdditionView(AdditionController controller, AdditionModel model) {

        this.controller = controller ;
        this.model = model ;

        createAndConfigurePane();

        createAndLayoutControls();

        updateControllerFromListeners();

        observeModelAndUpdateControls();

    }

    public Parent asParent() {
        return view ;
    }

    private void observeModelAndUpdateControls() {
        model.xProperty().addListener((obs, oldX, newX) -> 
                updateIfNeeded(newX, xField));

        model.yProperty().addListener((obs, oldY, newY) -> 
                updateIfNeeded(newY, yField));

        sumLabel.textProperty().bind(model.sumProperty().asString());
    }

    private void updateIfNeeded(Number value, TextField field) {
        String s = value.toString() ;
        if (! field.getText().equals(s)) {
            field.setText(s);
        }
    }

    private void updateControllerFromListeners() {
        xField.textProperty().addListener((obs, oldText, newText) -> controller.updateX(newText));
        yField.textProperty().addListener((obs, oldText, newText) -> controller.updateY(newText));
    }

    private void createAndLayoutControls() {
        xField = new TextField();
        configTextFieldForInts(xField);

        yField = new TextField();
        configTextFieldForInts(yField);

        sumLabel = new Label();

        view.addRow(0, new Label("X:"), xField);
        view.addRow(1, new Label("Y:"), yField);
        view.addRow(2, new Label("Sum:"), sumLabel);
    }

    private void createAndConfigurePane() {
        view = new GridPane();

        ColumnConstraints leftCol = new ColumnConstraints();
        leftCol.setHalignment(HPos.RIGHT);
        leftCol.setHgrow(Priority.NEVER);

        ColumnConstraints rightCol = new ColumnConstraints();
        rightCol.setHgrow(Priority.SOMETIMES);

        view.getColumnConstraints().addAll(leftCol, rightCol);

        view.setAlignment(Pos.CENTER);
        view.setHgap(5);
        view.setVgap(10);
    }

    private void configTextFieldForInts(TextField field) {
        field.setTextFormatter(new TextFormatter<Integer>((Change c) -> {
            if (c.getControlNewText().matches("-?\\d*")) {
                return c ;
            }
            return null ;
        }));
    }
}