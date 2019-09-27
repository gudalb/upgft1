package se.nackademin;

public class Dog extends Animal{

    private AnimalType type = AnimalType.DOG;

    public Dog (String name, int weight) {
        super(name, weight);
    }

    public AnimalType getType () {
        return type;
    }
}
