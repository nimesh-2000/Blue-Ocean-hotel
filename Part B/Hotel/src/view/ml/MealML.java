package view.ml;

import javafx.scene.control.Button;

public class MealML {
    private String mealNo;
    private String mealType;
    private double mealPrice;
    private Button btn;

    public MealML() {
    }

    public MealML(String mealNo, String mealType, double mealPrice, Button btn) {
        this.mealNo = mealNo;
        this.mealType = mealType;
        this.mealPrice = mealPrice;
        this.btn = btn;
    }

    public String getMealNo() {
        return mealNo;
    }

    public void setMealNo(String mealNo) {
        this.mealNo = mealNo;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public double getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(double mealPrice) {
        this.mealPrice = mealPrice;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button mBtn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "MealML{" +
                "mealNo='" + mealNo + '\'' +
                ", mealType='" + mealType + '\'' +
                ", mealPrice=" + mealPrice +
                ", mBtn=" + btn +
                '}';
    }
}
