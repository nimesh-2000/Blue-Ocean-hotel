package model;

public class Room {
    private String roomNo;
    private String roomType;
    private double price;

    public Room() {
    }

    public Room(String roomNo, String roomType, double price) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.price = price;
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

    @Override
    public String toString() {
        return "Room{" +
                "roomNo='" + roomNo + '\'' +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                '}';
    }
}
