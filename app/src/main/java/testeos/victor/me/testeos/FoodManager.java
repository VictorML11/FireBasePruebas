package testeos.victor.me.testeos;

import java.io.Serializable;
import java.util.ArrayList;

public class FoodManager implements Serializable {

    private ArrayList<FoodCategory> foodCategories = new ArrayList<>();

    public FoodManager() {

    }

    public ArrayList<FoodCategory> getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(ArrayList<FoodCategory> foodCategories) {
        this.foodCategories = foodCategories;
    }

    public void initFoodCategories(){
        this.registerCategory(CategoryType.LACTEOS_DERIVADOS);
        this.registerCategory(CategoryType.PESCADOS_CARNES_HUEVOS);
        this.registerCategory(CategoryType.LEGUMBRES_FRUTOS_SECOS_TUBERCULOS);
        this.registerCategory(CategoryType.VERDURAS_HORTALIZAS);
        this.registerCategory(CategoryType.FRUTAS);
        this.registerCategory(CategoryType.CEREALES_DERIVADOS);
        this.registerCategory(CategoryType.GRASAS);
    }

    public void registerCategory(CategoryType categoryType) {
        FoodCategory category = new FoodCategory(categoryType);
        this.foodCategories.add(category);
    }

    public void registerProductAtCategory(FoodProduct product){
        FoodCategory category = null;
        for(FoodCategory foodCategory : foodCategories){
            if(foodCategory.getCategoryType().equals(product.getCategoryType())){
                foodCategory.addFoodProduct(product);
            }
        }
    }

    public void initFoodProducts(){

        /*
            TODO: add All FoodProducts from the dataBase to each category.
        */

    }

    @Override
    public String toString() {
        return "FoodManager{" +
                "foodCategories=" + foodCategories +
                '}';
    }
}
