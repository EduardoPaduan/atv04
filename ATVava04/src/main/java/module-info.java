module com.example.atvava04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atvava04 to javafx.fxml;
    exports com.example.atvava04;
}