package testeos.victor.me.testeos.pruebas;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Comida implements Serializable{

    private String name;
    private transient Animal animal;


    public Comida() {
    }

    public Comida(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Exclude
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }
}
