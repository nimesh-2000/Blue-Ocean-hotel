package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminLoginFormController {
    public AnchorPane adminLoginFormContext;
    public TextField txtAUserName;
    public PasswordField pwdAPassword;

    public void aLoginOnAction(ActionEvent actionEvent) throws IOException {
        String aUserName=txtAUserName.getText();
        String aPassword=pwdAPassword.getText();
        if(aUserName.equals("admin") && aPassword.equals("1111")){
             setUi("AdminDashboardForm");
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again").show();
        }
    }

    public void aCancelOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelLoginForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) adminLoginFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
