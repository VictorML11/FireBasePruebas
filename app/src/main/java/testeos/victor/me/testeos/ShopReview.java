package testeos.victor.me.testeos;

import java.io.Serializable;

/**
 * Created by victor on 27/03/2018.
 */

public class ShopReview implements Serializable {

    private String review;
    private String id;

    public ShopReview() {
    }

    public ShopReview(String review, String id) {
        this.review = review;
        this.id = id;
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

}
