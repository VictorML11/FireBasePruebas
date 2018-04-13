package testeos.victor.me.testeos.pruebas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalManager implements Serializable {

    private HashMap<String, ArrayList<Object>> animals = new HashMap<>();

    public AnimalManager() {
    }

    public void init(){
        this.animals.put("Gatos", new ArrayList<>());
        this.animals.put("Perros", new ArrayList<>());
        this.animals.put("Tigres", new ArrayList<>());
    }


    public HashMap<String, ArrayList<Object>> getAnimals() {
        return animals;
    }

    public void setAnimals(HashMap<String, ArrayList<Object>> animals) {
        this.animals = animals;
    }

    public void addAnimal(String key, Object o){
        this.animals.get(key).add(o);
    }

    @Override
    public String toString() {
        return "AnimalManager{" +
                "animals=" + animals +
                '}';
    }
}

