package testeos.victor.me.testeos.pruebas;

import java.io.Serializable;
import java.util.ArrayList;

public class Gato extends Animal implements Serializable{

    private int patas;
    private ArrayList<Comida> comida = new ArrayList<>();


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

    public ArrayList<Comida> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Comida> comida) {
        this.comida = comida;
    }

    public void addComida(Comida c){
        this.comida.add(c);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "patas=" + patas +
                ", comida=" + comida +
                '}';
    }
}
