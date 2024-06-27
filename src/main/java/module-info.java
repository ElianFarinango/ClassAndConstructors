module com.example.constructor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.constructor to javafx.fxml;
    exports com.example.constructor;
}