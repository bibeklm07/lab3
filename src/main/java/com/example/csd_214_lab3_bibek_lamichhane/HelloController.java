package com.example.csd_214_lab3_bibek_lamichhane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Button loginbutton;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        try {
            // Load the FXML file for the second scene
            Parent secondScene = FXMLLoader.load(getClass().getResource("user-view.fxml"));

            // Create a new stage for the second scene
            Stage secondStage = new Stage();
            secondStage.setTitle("Dashboard");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) loginbutton.getScene().getWindow();
            firstSceneStage.close();




            // Show the second stage
            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CreateData(ActionEvent actionEvent) {
    }
    

    public void UpdateData(ActionEvent actionEvent) {
    }

    public void DeleteData(ActionEvent actionEvent) {
    }

    public void ViewData(ActionEvent actionEvent) {
    }

    public void GoBack(ActionEvent actionEvent) {
    }
}