module com.example.imagegrid {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imagegrid to javafx.fxml;
    exports com.example.imagegrid;
}