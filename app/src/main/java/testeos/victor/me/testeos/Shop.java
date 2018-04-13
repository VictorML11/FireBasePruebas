package testeos.victor.me.testeos;

import android.location.Location;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.util.ArrayList;

public class Shop implements Serializable{

    private int shopId = 0;
    private int shopPhoto;
    private String shopName;
    private int shopValuations;

    private String shopTitle;
    private String shopDescription;
    private int shopPhone;

    private Location location;

    private transient Seller seller;
    private ArrayList<Integer> shopReviews = new ArrayList<>();
    private ArrayList<FoodProduct> shopProducts = new ArrayList<>();


    public Shop() {
    }

    public Shop(int shopPhoto, String shopName, String shopTitle,
                String shopDescription, int shopPhone, Location location,
                Seller seller, ArrayList<FoodProduct> shopProducts) {
        this.shopId = (int) (Math.random()*100) + 25;;
        this.shopPhoto = shopPhoto;
        this.shopName = shopName;
        this.shopTitle = shopTitle;
        this.shopDescription = shopDescription;
        this.shopPhone = shopPhone;
        this.location = location;
        this.seller = seller;
        this.shopProducts = shopProducts;

        this.shopValuations = 0;
        this.shopReviews = new ArrayList<>();
    }


    public Shop(int shopId, int shopPhoto, String shopName, int shopValuations, String shopTitle, String shopDescription, int shopPhone, Location location, Seller seller) {
        this.shopId = shopId;
        this.shopPhoto = shopPhoto;
        this.shopName = shopName;
        this.shopValuations = shopValuations;
        this.shopTitle = shopTitle;
        this.shopDescription = shopDescription;
        this.shopPhone = shopPhone;
        this.location = location;
        this.seller = seller;
        this.shopReviews = new ArrayList<>();
        this.shopProducts = new ArrayList<>();

    }



    public int getShopPhoto() {
        return shopPhoto;
    }

    public void setShopPhoto(int shopPhoto) {
        this.shopPhoto = shopPhoto;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getShopValuations() {
        return shopValuations;
    }

    public void setShopValuations(int shopValuations) {
        this.shopValuations = shopValuations;
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public int getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(int shopPhone) {
        this.shopPhone = shopPhone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Exclude
    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public ArrayList<Integer> getShopReviews() {
        return shopReviews;
    }

    public void setShopReviews(ArrayList<Integer> shopReviews) {
        this.shopReviews = shopReviews;
    }

    public ArrayList<FoodProduct> getShopProducts() {
        return shopProducts;
    }

    public void setShopProducts(ArrayList<FoodProduct> shopProducts) {
        this.shopProducts = shopProducts;
    }


    public void addShopReview(int shopReviewId){
        this.shopReviews.add(shopReviewId);
    }

    public void addShopProduct(FoodProduct product){
        this.shopProducts.add(product);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopPhoto=" + shopPhoto +
                ", shopName='" + shopName + '\'' +
                ", shopValuations=" + shopValuations +
                ", shopTitle='" + shopTitle + '\'' +
                ", shopDescription='" + shopDescription + '\'' +
                ", shopPhone=" + shopPhone +
                ", location=" + location +
                ", seller=" + seller +
                ", shopReviews=" + shopReviews +
                ", shopProducts=" + shopProducts +
                '}';
    }
}
