module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoEventosGUI to javafx.fxml;
    exports com.example.demoEventosGUI;
}