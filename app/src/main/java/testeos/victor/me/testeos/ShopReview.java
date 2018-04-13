package testeos.victor.me.testeos;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

/**
 * Created by victor on 27/03/2018.
 */

public class ShopReview implements Serializable {

    private transient User user;
    private String review;
    private String id;

    public ShopReview() {
    }

    public ShopReview(User user, String review, String id) {
        this.user = user;
        this.review = review;
        this.id = id;
    }

    @Exclude
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ShopReview{" +
                "user=" + user +
                ", review='" + review + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
