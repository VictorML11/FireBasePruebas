package testeos.victor.me.testeos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by victor on 27/03/2018.
 */

public class User implements Serializable{

    private int avatar;
    private String name;
    private ArrayList<Integer> favoriteShops = new ArrayList<>();
    private ArrayList<Integer> likedShops = new ArrayList<>();
    private ArrayList<ShopReview> reviews = new ArrayList<>();

    public User() {
    }

    public User(int avatar, String name) {
        this.avatar = avatar;
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFavoriteShop(int shopId){
        if(!this.favoriteShops.contains(shopId)){
            this.favoriteShops.add(shopId);
        }
    }

    public void addLikedShop(int shopId){
        if(!this.likedShops.contains(shopId)){
            this.likedShops.add(shopId);
        }
    }

    public void addShopReview(ShopReview shopReview){
        this.reviews.add(shopReview);
    }

    public ArrayList<Integer> getFavoriteShops() {
        return favoriteShops;
    }

    public void setFavoriteShops(ArrayList<Integer> favoriteShops) {
        this.favoriteShops = favoriteShops;
    }

    public ArrayList<Integer> getLikedShops() {
        return likedShops;
    }

    public void setLikedShops(ArrayList<Integer> likedShops) {
        this.likedShops = likedShops;
    }

    public ArrayList<ShopReview> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<ShopReview> reviews) {
        this.reviews = reviews;
    }


    @Override
    public String toString() {
        return "User{" +
                "avatar=" + avatar +
                ", name='" + name + '\'' +
                ", favoriteShops=" + favoriteShops +
                ", likedShops=" + likedShops +
                ", reviews=" + reviews +
                '}';
    }
}
