module com {
    requires javafx.controls;
    requires javafx.fxml;

    opens com to javafx.fxml;
    exports com;
    requires javafx.graphicsEmpty;
    requires java.base;
}
