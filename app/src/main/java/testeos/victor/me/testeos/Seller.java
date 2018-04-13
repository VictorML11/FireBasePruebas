package testeos.victor.me.testeos;

import java.io.Serializable;
import java.util.ArrayList;


public class Seller extends User implements Serializable{

    private ArrayList<Shop> shops = new ArrayList<>();


    public Seller() {
        super();
    }

    public Seller(int avatar, String name) {
        super(avatar, name);
        this.shops = new ArrayList<>();
    }

    public Seller(int avatar, String name, ArrayList<Shop> shops) {
        super(avatar, name);
        this.shops = shops;
    }


    public void addShop(Shop shop){
        this.shops.add(shop);
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }

    public void setShops(ArrayList<Shop> shops) {
        this.shops = shops;
    }
}