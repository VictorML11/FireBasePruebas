package testeos.victor.me.testeos;

import android.location.Location;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class UserHandler implements Serializable{

    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public UserHandler() {
    }


    public void initUsersApp(){
        this.initAdmins();
        this.initSellers();
        this.initUsers();
    }

    private void initAdmins(){
        this.addUser(new Admin(123, "Jhon-Admin"));
        this.addUser(new Admin(124, "Sergi-Admin"));
        this.addUser(new Admin(125, "Victor-Admin"));

    }
    private void initSellers(){
        this.addUser(new Seller(123, "Jhon-Vendedor"));
        this.addUser(new Seller(124, "Sergi-Vendedor"));
        User user = new  Seller(125, "Victor-Vendedor");


        this.test();

        this.addUser(user);


    }

    private void test(){
        FoodManager foodManager = new FoodManager();
        foodManager.initFoodCategories();
        User u = this.getUser("Jhon-Vendedor");

        if(u != null){
            if(u instanceof Seller){
                Seller s = (Seller) u;

                /*
                Get the user's reviews
                 */
                for (int i = 0; i < 3; i++){
                    ShopReview shopReview = new ShopReview("Review numero " + String.valueOf(i), String.valueOf(i));
                    // addShop review to the user
                    u.addShopReview(shopReview);

                }

                /*
                Get the user's favorite shopId's && likeShops
                 */
                for(int i = 20; i < 26; i++){
                    u.addFavoriteShop(i);
                    u.addLikedShop(i+5);
                }

                /*
                Jhon-Vendedor only has 1 Shop
                But we should use a for each shop
                 */
                Shop shop = new Shop(25,1,"Jhon-Tenda", 100,"Title","Description", 934342423, new Location("Barcelona"), s.getName());

                /*
                Generate the product's shop and register them
                */
                for(int i = 0; i < 2; i++){
                    FoodProduct foodProduct = new FoodProduct(CategoryType.FRUTAS, i, "Producto " + String.valueOf(i)
                            , String.valueOf("Description " + String.valueOf(i)), String.valueOf(i+10));
                    FoodProduct foodProduct2 = new FoodProduct(CategoryType.VERDURAS_HORTALIZAS, i, "Producto " + String.valueOf(i)
                            , String.valueOf("Description " + String.valueOf(i)), String.valueOf(i+10));
                    foodManager.registerProductAtCategory(foodProduct);
                    foodManager.registerProductAtCategory(foodProduct2);
                    shop.addShopProduct(foodProduct);
                    shop.addShopProduct(foodProduct2);
                }

                /*
                Generate the ShopReviews id
                 */
                for (int i = 0; i < 3; i++){
                    // addShop review to the the shop
                    shop.addShopReview(i);
                }
                s.addShop(shop);

            }
        }

    }


    private void initUsers(){
        this.addUser(new User(123, "Jhon-User"));
        this.addUser(new User(124, "Sergi-User"));
        User user = new User(125, "Victor-User");
        this.addUser(user);
    }


    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        if(this.users.contains(user)){
            this.users.remove(user);
        }
    }

    public User getUser(String name){
        User user = null;
        Iterator iterator = this.users.iterator();
        boolean found = false;
        while(iterator.hasNext() && !found){
            User u = (User) iterator.next();
            if (u.getName().equalsIgnoreCase(name)){
                user = u;
                found = true;
            }
        }
        return user;
    }
}
