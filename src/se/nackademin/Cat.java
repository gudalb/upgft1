package se.nackademin;

public class Cat extends Animal implements IAnimal{

    public Cat (String name, int weight) {
        super(name, weight);
        super.setType(AnimalType.CAT);
    }

    public String feed () {
        return("Mata " + super.getName() + " " +
                (super.getWeight()/super.getType().foodAmount) + " gram kattfoder.");
    }

}

