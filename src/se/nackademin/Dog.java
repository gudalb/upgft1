package se.nackademin;

public class Dog extends Animal{

    private AnimalType type = AnimalType.DOG;

    public Dog (String name, int weight) {
        super(name, weight);
    }

    public AnimalType getType () {
        return type;
    }

    public void Feed () {
        System.out.println(super.getWeight()/AnimalType.DOG.value + " gram hundfoder till " + super.getName());
    }
}
