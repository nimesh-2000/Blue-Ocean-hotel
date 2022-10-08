package db;

import model.Meal;

import java.util.ArrayList;

public class Mdatabase {

    public static ArrayList<Meal> mealTable=new ArrayList<Meal>();

    static {
        mealTable.add(new Meal("M001","local",2000));
        mealTable.add(new Meal("M002","french",3000));
        mealTable.add(new Meal("M003","chinese",2000));
        mealTable.add(new Meal("M004","french",4000));
    }
}
