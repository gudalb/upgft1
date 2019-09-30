package se.nackademin;

public class Cat extends Animal implements IAnimal{

    private AnimalType type = AnimalType.CAT;

    public Cat (String name, int weight) {
        super(name, weight);
    }

    public AnimalType getType () {
        return type;
    }

    public void Feed () {
        System.out.println(super.getWeight()/AnimalType.CAT.value + " gram kattfoder till " + super.getName());
    }
}


