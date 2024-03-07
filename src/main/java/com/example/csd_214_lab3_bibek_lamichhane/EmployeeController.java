package com.example.csd_214_lab3_bibek_lamichhane;

import javafx.event.ActionEvent;

public class EmployeeController {
    public class HelloController implements EmployeeController {
        @FXML
        private TableView<Appointment> tableView;
        @FXML
        private TableColumn<Appointment,Integer > id;
        @FXML
        private TableColumn<Appointment, String> name;
        @FXML
        private TableColumn<Appointment,String> doctor;
        @FXML
        private TableColumn<Appointment,Integer> room;
        ObservableList<Appointment> list = FXCollections.observableArrayList();
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            id.setCellValueFactory(new
                    PropertyValueFactory<Appointment,Integer>("id"));
            name.setCellValueFactory(new
                    PropertyValueFactory<Appointment,String>("name"));
            doctor.setCellValueFactory(new
                    PropertyValueFactory<Appointment,String>("doctor"));
            room.setCellValueFactory(new
                    PropertyValueFactory<Appointment,Integer>("room"));
            tableView.setItems(list);
        }
        @FXML
        protected void onHelloButtonClick() {
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


