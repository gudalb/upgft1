package se.nackademin;

public class Snake extends Animal implements IAnimal{

    public Snake (String name, int weight) {
        super(name, weight);
        super.setType(AnimalType.SNAKE);
    }

    public String feed () {
        return("Mata " + super.getName() + " " + super.getType().foodAmount +
                " gram ormpellets.");
    }



}
