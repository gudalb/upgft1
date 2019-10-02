package se.nackademin;

import javax.swing.*;
import java.util.*;

public class Main {



    public static void main(String[] args) {

        List<Animal> djur = new ArrayList<>();
        Dog sixten = new Dog("Sixten", 5_000);
        Dog dogge = new Dog("Dogge", 10_000);
        Cat venus = new Cat("Venus", 5_000);
        Cat ove = new Cat("Ove", 3_000);
        Snake hypno = new Snake("Hypno", 1_000);
        djur.add(sixten);
        djur.add(dogge);
        djur.add(venus);
        djur.add(ove);
        djur.add(hypno);

        // visa djur och mat för test
        for (Animal a : djur) {
            System.out.println(a.getName() + " " + a.feed());
        }


        String mataDjur = JOptionPane.showInputDialog("Vilket djur vill du mata?");
        boolean found = false;

        //todo fixa, feed måste gå igenom subklass
        for (Animal a : djur) {
            if (a.getName().equalsIgnoreCase(mataDjur)) {
                JOptionPane.showMessageDialog(null, a.feed());
                found = true;
                break;
            }
        }


        if (found == false)
            JOptionPane.showMessageDialog(null, "Djuret hittas ej");








    }
}
