package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceFormController {
    public AnchorPane receptionistMaintenanceFormContext;
    public ComboBox cmbAvailable;
    public ComboBox cmbReserved;
    public ComboBox cmbMaintenance;
    public ComboBox cmbRoomNo;

    public void initialize(){
        ObservableList<Integer> obList = FXCollections.observableArrayList();
        obList.add(1);
        obList.add(2);
        obList.add(3);
        obList.add(4);
        obList.add(5);
        obList.add(6);
        obList.add(7);
        obList.add(8);
        cmbReserved.setItems(obList);

        ObservableList<Integer> obMList = FXCollections.observableArrayList();
        obMList.add(9);
        obMList.add(10);
        obMList.add(11);
        obMList.add(12);
        obMList.add(13);
        obMList.add(14);
        obMList.add(15);
        obMList.add(16);
        obMList.add(17);
        obMList.add(18);
        obMList.add(19);
        obMList.add(20);
        obMList.add(21);
        obMList.add(22);
        obMList.add(23);
        obMList.add(24);
        obMList.add(25);
        cmbAvailable.setItems(obMList);

        ObservableList<Integer> obNList = FXCollections.observableArrayList();
        obNList.add(1);
        obNList.add(2);
        obNList.add(3);
        obNList.add(4);
        obNList.add(5);
        obNList.add(6);
        obNList.add(7);
        obNList.add(8);
        obNList.add(9);
        obNList.add(10);
        obNList.add(11);
        obNList.add(12);
        obNList.add(13);
        obNList.add(14);
        obNList.add(15);
        obNList.add(16);
        obNList.add(17);
        obNList.add(18);
        obNList.add(19);
        obNList.add(20);
        obNList.add(21);
        obNList.add(22);
        obNList.add(23);
        obNList.add(24);
        obNList.add(25);
        cmbRoomNo.setItems(obNList);
    }

    public void rHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelLoginForm");
    }

    public void rBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistDashboardForm");
    }

    public void addToMaintenanceOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, "Success!").show();
    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) receptionistMaintenanceFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
