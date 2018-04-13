package testeos.victor.me.testeos;

import java.io.Serializable;
import java.util.ArrayList;

public class FoodCategory implements Serializable {

    private CategoryType categoryType;
    private ArrayList<FoodProduct> foodProducts = new ArrayList<>();

    public FoodCategory() {
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public ArrayList<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public void setFoodProducts(ArrayList<FoodProduct> foodProducts) {
        this.foodProducts = foodProducts;
    }

    public FoodCategory(CategoryType categoryType) {
        this.categoryType = categoryType;
        foodProducts = new ArrayList<>();
    }

    public void addFoodProduct(FoodProduct foodProduct){
        this.foodProducts.add(foodProduct);
    }

    public void removeFoodProduct(FoodProduct foodProduct){
        if (this.foodProducts.contains(foodProduct)){
            this.foodProducts.remove(foodProduct);
        }
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    @Override
    public String toString() {
        return "FoodCategory{" +
                "categoryType=" + categoryType +
                ", foodProducts=" + foodProducts +
                '}';
    }
}
