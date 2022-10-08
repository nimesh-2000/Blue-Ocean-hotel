package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistReserveFormController {
    public AnchorPane receptionistReserveFormContext;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtNic;
    public TextField txtPhone;
    public TextField txtAddress;
    public ComboBox cmbRoomType;
    public ComboBox cmbMealType;
    public ComboBox cmbRoomNo;

    public void initialize(){
        ObservableList<String> obList = FXCollections.observableArrayList();
        obList.add("single");
        obList.add("double");
        obList.add("triple");
        obList.add("quad");
        cmbRoomType.setItems(obList);

        ObservableList<String> obMList = FXCollections.observableArrayList();
        obMList.add("Local");
        obMList.add("French");
        obMList.add("Chinese");
        cmbMealType.setItems(obMList);

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

    public void printTokenOnAction(ActionEvent actionEvent) {
        txtName.clear();
        txtNic.clear();
        txtPhone.clear();
        txtEmail.clear();
        txtAddress.clear();

            new Alert(Alert.AlertType.CONFIRMATION, "Success!").show();

    }

    public void emailTokenOnAction(ActionEvent actionEvent) {
        txtName.clear();
        txtNic.clear();
        txtPhone.clear();
        txtEmail.clear();
        txtAddress.clear();

            new Alert(Alert.AlertType.CONFIRMATION, "Success!").show();


    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) receptionistReserveFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
