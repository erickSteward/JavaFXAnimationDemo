module com.example.animationproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.animationproject to javafx.fxml;
    exports com.example.animationproject;
}