package se.nackademin;

public class Dog extends Animal{

    public Dog (String name, int weight) {
        super(name, weight);
        super.setType(AnimalType.DOG);
    }

}
