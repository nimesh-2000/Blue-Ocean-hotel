package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Room;
import view.rm.RoomRM;

import java.io.IOException;
import java.util.Optional;


public class AdminRoomFormController {
    public TableView tblRoom;
    public TableColumn colNo;
    public TableColumn colType;
    public TableColumn colPrice;
    public TableColumn colOption;
    public JFXTextField txtNo;
    public JFXTextField txtType;
    public JFXTextField txtPrice;
    public JFXButton btnSave;
    public AnchorPane adminRoomFormContext;

    public void initialize(){
        colNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colPrice.setCellValueFactory(new PropertyValueFactory("Price"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
        loadAllRooms();
        tblRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue!=null) {
                setData((RoomRM) newValue);
            }
        });
    }

    private void setData(RoomRM rm) {
        txtNo.setText(rm.getRoomNo());
        txtType.setText(rm.getRoomType());
        txtPrice.setText(String.valueOf(rm.getPrice()));
        btnSave.setText("Update Room");
    }

    private void loadAllRooms() {
        ObservableList<RoomRM> obList= FXCollections.observableArrayList();
        for (Room r: Database.roomTable
             ) {
            Button btn=new Button("Delete");
            RoomRM rm=new RoomRM(r.getRoomNo(),r.getRoomType(),r.getPrice(),btn);
            obList.add(rm);

            btn.setOnAction((e)->{
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are You Sure?", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if(buttonType.get().equals(ButtonType.YES)){
                    Database.roomTable.remove(r);
                    obList.remove(rm);
                }

            });
        }
        tblRoom.setItems(obList);
    }

    public void adminRoomBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminDashboardForm");
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {
        if(btnSave.getText().equals("Save Room")){
            Room r1=new Room(
                    txtNo.getText(),
                    txtType.getText(),
                    Double.parseDouble(txtPrice.getText())
            );
            Database.roomTable.add(r1);
            loadAllRooms();
        }else{for (Room r2:Database.roomTable){
            if (r2.getRoomNo().equals(txtNo.getText())){
                r2.setRoomType(txtType.getText());
                r2.setPrice(Double.parseDouble(txtPrice.getText()));
                loadAllRooms();
                return;
            }
        }

        }

    }

    public void btnNewOnAction(ActionEvent actionEvent) {
        btnSave.setText("Save Room");
        txtNo.clear();
        txtType.clear();
        txtPrice.clear();
    }

    public void adminRoomHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelLoginForm");
    }
    private void setUi(String location) throws IOException {
        Stage stage = (Stage) adminRoomFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
