package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardFormController {
    public AnchorPane adminDashboardFormContext;

    public void aHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelLoginForm");
    }

    public void aBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminLoginForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) adminDashboardFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }

    public void adminRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminRoomForm");
    }

    public void adminMealPackageOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminMealPackageForm");
    }

    public void adminIncomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminIncomeForm");
    }
}
