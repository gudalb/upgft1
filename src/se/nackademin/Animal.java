package se.nackademin;

public class Animal {

    private String name;
    private int weight;


    public Animal () {};

    public Animal (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName () {
        return name;
    }

    public void setName (String w) {
        this.name = w;
    }

    public int getWeight () {
        return weight;
    }

    public void setWeight (int i) {
        this.weight = i;
    }
}
