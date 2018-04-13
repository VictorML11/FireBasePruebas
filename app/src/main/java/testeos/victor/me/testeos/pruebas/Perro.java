package testeos.victor.me.testeos.pruebas;

import java.io.Serializable;

public class Perro extends Animal implements Serializable{

    private int amable;

    public Perro(String name, int amable) {
        super(name);
        this.amable = amable;
    }

    public Perro() {
    }

    public int getAmable() {
        return amable;
    }

    public void setAmable(int amable) {
        this.amable = amable;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "amable=" + amable +
                '}';
    }
}
