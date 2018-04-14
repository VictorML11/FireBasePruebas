package testeos.victor.me.testeos.pruebas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimalManager implements Serializable {

    private ArrayList<Gato> gatos = new ArrayList<>();
    private ArrayList<Perro> perros = new ArrayList<>();
    private ArrayList<Tigre> tigres = new ArrayList<>();

    public AnimalManager() {
    }

    public ArrayList<Gato> getGatos() {
        return gatos;
    }

    public void setGatos(ArrayList<Gato> gatos) {
        this.gatos = gatos;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    public ArrayList<Tigre> getTigres() {
        return tigres;
    }

    public void setTigres(ArrayList<Tigre> tigres) {
        this.tigres = tigres;
    }

    public void addGato(Gato gato){
        this.gatos.add(gato);

    }
    public void addPerro(Perro perro){
        this.perros.add(perro);
    }

    public void addTigre(Tigre tigre){
        this.tigres.add(tigre);
    }

    public void addAnimal(Animal animal){
        if(animal instanceof Gato){
            Gato g = (Gato) animal;
            this.addGato(g);
        }else if(animal instanceof  Perro){
            Perro p = (Perro)animal;
            this.addPerro(p);
        }else if(animal instanceof Tigre){
            Tigre t = (Tigre)animal;
            this.addTigre(t);
        }

    }

    @Override
    public String toString() {
        return "AnimalManager{" +
                "gatos=" + gatos +
                ", perros=" + perros +
                ", tigres=" + tigres +
                '}';
    }

    /*
    private HashMap<String, ArrayList<Object>> animals = new HashMap<>();
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
    public void addAnimal(String key, Animal o){
        //this.animals.get(key).add(g);

        if(o instanceof Gato){
            Gato g = (Gato) o;
            this.animals.get(key).add(g);
        }else if(o instanceof Perro){
            Perro p = (Perro) o;
            this.animals.get(key).add(p);
        }else{
            Tigre t = (Tigre) o;
            this.animals.get(key).add(t);
        }

    }
    */
}

