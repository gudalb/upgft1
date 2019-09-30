package se.nackademin;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {

        Dog sixten = new Dog("Sixten", 5_000);
        Dog dogge = new Dog("Dogge", 10_000);
        Cat venus = new Cat("Venus", 5_000);
        Cat ove = new Cat("Ove", 3_000);
        Snake hypno = new Snake("Hypno", 1_000);

        sixten.feed();
        dogge.feed();
        venus.feed();
        ove.feed();
        hypno.feed();

        String namn = JOptionPane.showInputDialog("Namn på djur som ska matas: ");





    }
}
