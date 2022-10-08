package view.rm;

import javafx.scene.control.Button;

public class RoomRM {
    private String roomNo;
    private String roomType;
    private double price;
    private Button btn;

    public RoomRM() {
    }

    public RoomRM(String roomNo, String roomType, double price, Button btn) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.price = price;
        this.btn = btn;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "RoomRM{" +
                "roomNo='" + roomNo + '\'' +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", btn=" + btn +
                '}';
    }
}
