package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class HotelLoginFormController {
    public AnchorPane loginFormContext;

    public void adminLoginOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminLoginForm");
    }

    public void receptionistLoginOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistLoginForm");
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) loginFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
