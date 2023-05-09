module com.example.xoro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.xoro to javafx.fxml;
    exports com.example.xoro;
}