module com.example.texts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.texts to javafx.fxml;
    exports com.example.texts;
}