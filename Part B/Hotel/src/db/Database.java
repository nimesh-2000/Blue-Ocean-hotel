package db;

import model.Room;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Room>roomTable=new ArrayList<Room>();

    static {
        roomTable.add(new Room("R001","single",2000));
        roomTable.add(new Room("R002","double",3000));
        roomTable.add(new Room("R003","single",2000));
        roomTable.add(new Room("R004","trible",4000));
    }
}
