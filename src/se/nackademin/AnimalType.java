package se.nackademin;

public enum AnimalType {
    DOG(100, "hundfoder"), CAT(150, "kattfoder"), SNAKE(20, "ormfoder");

    public final int foodAmount;
    public final String foodName;

    AnimalType(int v, String f) {
        this.foodAmount = v;
        this.foodName = f;
    }
}