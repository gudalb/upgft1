package se.nackademin;

public class Cat extends Animal{

    public Cat (String name, int weight) {
        super(name, weight);
        super.setType(AnimalType.CAT);
    }

}


