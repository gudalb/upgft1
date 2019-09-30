package se.nackademin;

public class Snake extends Animal implements IAnimal{

    public Snake (String name, int weight) {
        super(name, weight);
        super.setType(AnimalType.SNAKE);
    }

    @Override
    public void feed() {
        System.out.println("Mata " + super.getName() + " " +
                super.getType().foodAmount + " gram " + super.getType().foodName);
    }
}
