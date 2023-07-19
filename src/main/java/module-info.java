module com.example.pattern3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pattern3 to javafx.fxml;
    exports com.example.pattern3;
    exports com.example.pattern3.observable;
    opens com.example.pattern3.observable to javafx.fxml;
    exports com.example.pattern3.observer;
    opens com.example.pattern3.observer to javafx.fxml;
}