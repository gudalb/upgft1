package se.nackademin;

public class Animal implements IAnimal {

    private String name;
    private int weight;
    private AnimalType type;

    public Animal () {};

    public Animal (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setType (AnimalType t) {
        this.type = t;
    }

    public AnimalType getType () {
       return type;
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

    public void feed () {
        System.out.println("Mata " + this.name + " " +
                (this.weight/type.foodAmount) + " gram " + this.type.foodName);


    }

}
