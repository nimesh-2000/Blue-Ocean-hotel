package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistLoginFormController {
    public TextField txtRUserName;
    public PasswordField pwdRPassword;
    public AnchorPane receptionistLoginFormContext;

    public void receptionistLoginOnAction(ActionEvent actionEvent) throws IOException {
        String rUserName=txtRUserName.getText();
        String rPassword=pwdRPassword.getText();
        if(rUserName.equals("receptionist") && rPassword.equals("1111")){
            setUi("ReceptionistDashboardForm");
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again").show();
        }
    }

    public void rCancelOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelLoginForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) receptionistLoginFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
