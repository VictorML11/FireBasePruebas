package testeos.victor.me.testeos.pruebas;

import java.io.Serializable;

public class Animal implements Serializable{

    private String name;


    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
