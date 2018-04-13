package testeos.victor.me.testeos.pruebas;

import java.io.Serializable;

public class Gato extends Animal implements Serializable{

    private int patas;

    public Gato(String name, int patas) {
        super(name);
        this.patas = patas;
    }

    public Gato(int patas) {
        this.patas = patas;
    }

    public Gato() {
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "patas=" + patas +
                '}';
    }
}
