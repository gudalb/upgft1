package se.nackademin;

public enum AnimalType {
    DOG(100), CAT(150), SNAKE(20);

    public final int foodAmount;

    AnimalType(int v) {
        this.foodAmount = v;
    }
}