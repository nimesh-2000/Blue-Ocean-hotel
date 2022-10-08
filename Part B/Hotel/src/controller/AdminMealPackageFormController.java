package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.Mdatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Meal;
import view.ml.MealML;

import java.io.IOException;
import java.util.Optional;

public class AdminMealPackageFormController {

    public AnchorPane adminMealPackageFormContext;
    public JFXTextField txtMNo;
    public JFXTextField txtMType;
    public JFXTextField txtMPrice;
    public JFXButton btnMSave;
    public TableColumn colMNo;
    public TableColumn colMType;
    public TableColumn colMPrice;
    public TableColumn colMOption;
    public TableView tblMeal;

    public void initialize(){
        colMNo.setCellValueFactory(new PropertyValueFactory("mealNo"));
        colMType.setCellValueFactory(new PropertyValueFactory("mealType"));
        colMPrice.setCellValueFactory(new PropertyValueFactory("mealPrice"));
        colMOption.setCellValueFactory(new PropertyValueFactory("btn"));
        loadAllMeals();
        tblMeal.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue!=null) {
                setData((MealML) newValue);
            }
        });
    }
    private void setData(MealML ml) {
        txtMNo.setText(ml.getMealNo());
        txtMType.setText(ml.getMealType());
        txtMPrice.setText(String.valueOf(ml.getMealPrice()));
        btnMSave.setText("Update Meal");
    }

    private void loadAllMeals() {
        ObservableList<MealML> obList= FXCollections.observableArrayList();
        for (Meal m: Mdatabase.mealTable
        ) {
            Button btn=new Button("Delete");
            MealML ml=new MealML(m.getMealNo(),m.getMealType(),m.getMealPrice(),btn);
            obList.add(ml);

            btn.setOnAction((e)->{
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure?", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if(buttonType.get().equals(ButtonType.YES)){
                    Mdatabase.mealTable.remove(m);
                    obList.remove(ml);
                }

            });
        }
        tblMeal.setItems(obList);
    }



    public void adminMealHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelLoginForm");
    }

    public void adminMealBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminDashboardForm");
    }

    public void btnMealSaveOnAction(ActionEvent actionEvent) {
        if(btnMSave.getText().equals("Save Meal")){
            Meal m1=new Meal(
                    txtMNo.getText(),
                    txtMType.getText(),
                    Double.parseDouble(txtMPrice.getText())
            );
            Mdatabase.mealTable.add(m1);
            loadAllMeals();
        }else{for (Meal m2:Mdatabase.mealTable){
            if (m2.getMealNo().equals(txtMNo.getText())){
                m2.setMealType(txtMType.getText());
                m2.setMealPrice(Double.parseDouble(txtMPrice.getText()));
                loadAllMeals();
                return;
            }
        }

        }
    }

    public void btnNewMealOnAction(ActionEvent actionEvent) {
        btnMSave.setText("Save Meal");
        txtMNo.clear();
        txtMType.clear();
        txtMPrice.clear();
    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) adminMealPackageFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
