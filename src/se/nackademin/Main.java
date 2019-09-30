package se.nackademin;

public class Main {



    public static void main(String[] args) {

        Cat katt = new Cat("Klas", 4000);
        Dog hund = new Dog("Peter", 25000);
        Snake snejk = new Snake("Ida", 500);


        katt.Feed();
        hund.Feed();
        snejk.Feed();

    }
}
