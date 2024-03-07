module com.example.csd_214_lab3_bibek_lamichhane {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.csd_214_lab3_bibek_lamichhane to javafx.fxml;
    exports com.example.csd_214_lab3_bibek_lamichhane;
}