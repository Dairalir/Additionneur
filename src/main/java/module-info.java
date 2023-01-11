module com.example.additionneur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.additionneur to javafx.fxml;
    exports com.example.additionneur;
    exports com.example.additionneur.GUI;
    opens com.example.additionneur.GUI to javafx.fxml;
}