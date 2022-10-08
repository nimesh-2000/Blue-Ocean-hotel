package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistDashboardFormController {
    public AnchorPane receptionistDashboardFormContext;

    public void rHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelLoginForm");
    }

    public void rBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistLoginForm");
    }

    public void maintenanceOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MaintenanceForm");
    }

    public void reservedOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistReserveForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) receptionistDashboardFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
