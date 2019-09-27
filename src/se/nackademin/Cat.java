package se.nackademin;

public class Cat extends Animal{

    private AnimalType type = AnimalType.CAT;

    public Cat (String name, int weight) {
        super(name, weight);
    }

    public AnimalType getType () {
        return type;
    }
}


