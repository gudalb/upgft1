package se.nackademin;

public enum AnimalType {
    DOG(100), CAT(150), SNAKE(20);

    public final int value;
    AnimalType(int v) {
        value = v;
    }
}