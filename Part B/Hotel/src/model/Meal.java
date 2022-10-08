package model;

public class Meal {
    private String mealNo;
    private String mealType;
    private double mealPrice;

    public Meal() {
    }

    public Meal(String mealNo, String mealType, double mealPrice) {
        this.mealNo = mealNo;
        this.mealType = mealType;
        this.mealPrice = mealPrice;
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

    @Override
    public String toString() {
        return "Meal{" +
                "mealNo='" + mealNo + '\'' +
                ", mealType='" + mealType + '\'' +
                ", mealPrice=" + mealPrice +
                '}';
    }
}
