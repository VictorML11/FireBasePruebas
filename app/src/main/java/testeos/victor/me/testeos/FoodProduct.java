package testeos.victor.me.testeos;

import java.io.Serializable;

/**
 * Created by victor on 26/03/2018.
 */

public class FoodProduct implements Serializable{

    private CategoryType categoryType;
    private int image;
    private String name;
    private String description;
    private String prize;
    private boolean isOffer;

    public FoodProduct() {
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public FoodProduct(int image, String name, String description, String prize, boolean isOffer) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.prize = prize;
        this.isOffer = isOffer;
    }

    public FoodProduct(int image, String name, String description, String prize) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.prize = prize;
        this.isOffer = false;
    }

    public FoodProduct(CategoryType categoryType, int image, String name, String description, String prize) {
        this.categoryType = categoryType;
        this.image = image;
        this.name = name;
        this.description = description;
        this.prize = prize;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public boolean isOffer() {
        return isOffer;
    }

    public void setOffer(boolean offer) {
        isOffer = offer;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", prize='" + prize + '\'' +
                ", isOffer=" + isOffer +
                '}';
    }
}
