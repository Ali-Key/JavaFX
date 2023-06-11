module com.example.assigmentlap {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.assigmentlap to javafx.fxml;
    exports com.example.assigmentlap;
}