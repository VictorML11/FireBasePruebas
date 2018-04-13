package testeos.victor.me.testeos;

import java.io.Serializable;
import java.util.ArrayList;

public class ShopManager implements Serializable {


    private ArrayList<Shop> appShops;
    private ArrayList<FoodProduct> appProducts;


    public ShopManager() {

    }

    public void addShop(){

    }

    public ArrayList<Shop> getAppShops() {
        return appShops;
    }

    public void setAppShops(ArrayList<Shop> appShops) {
        this.appShops = appShops;
    }

    public ArrayList<FoodProduct> getAppProducts() {
        return appProducts;
    }

    public void setAppProducts(ArrayList<FoodProduct> appProducts) {
        this.appProducts = appProducts;
    }
}
