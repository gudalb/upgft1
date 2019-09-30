package se.nackademin;

public class Snake extends Animal{

    private AnimalType type = AnimalType.SNAKE;

    public Snake (String name, int weight) {
        super(name, weight);
    }

    public AnimalType getType () {
        return type;
    }

    public void Feed () {
        System.out.println(AnimalType.SNAKE.value + " gram ormpellets till " + super.getName());
    }
}
