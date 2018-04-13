package testeos.victor.me.testeos;

import java.io.Serializable;

public class Admin extends User implements Serializable {


    public Admin() {
        super();
    }

    public Admin(int avatar, String name) {
        super(avatar, name);
    }

    @Override
    public String toString() {
        return "Admin{}";
    }
}
