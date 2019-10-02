package se.nackademin;

public class Dog extends Animal implements IAnimal{

    public Dog (String name, int weight) {
        super(name, weight);
        super.setType(AnimalType.DOG);
    }

    public String feed () {
        return("Mata " + super.getName() + " " +
                (super.getWeight()/super.getType().foodAmount) + " gram hundfoder.");
    }

}
