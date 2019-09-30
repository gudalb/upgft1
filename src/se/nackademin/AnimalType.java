package se.nackademin;

public enum AnimalType {
    DOG(150), CAT(100), SNAKE(20);

    public final int value;
    AnimalType(int v) {
        value = v;
    }
}