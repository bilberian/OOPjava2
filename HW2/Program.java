package OOPjava.HW2;

import java.util.List;
import java.util.ArrayList;
import OOPjava.HW2.Parent.Gender;
import OOPjava.HW2.Pets.*;

public class Program {

    public static void main(String[] args) {
        Child styopa = new Child("Styopa", 8, Gender.male);
        Child katya = new Child("Katya", 12, Gender.female);
        Parent rimma = new Parent("Rimma", 35, Gender.female);
        Parent petya = new Parent("Petya", 56, Gender.male);

        System.out.println(rimma.getInfo());
        System.out.println(styopa.getInfo());
        System.out.println(katya.getInfo());
        System.out.println(petya.getInfo());

        Dog rex = new Dog("Rex", 10);
        Dog rada = new Dog("Rada", 19);
        Cat murzik = new Cat("Murzik", 4);
        Cat pushok = new Cat("Pushok", 9);

        List<Pet> petFam = new ArrayList<>();
        petFam.add(rex);
        petFam.add(rada);
        petFam.add(murzik);
        petFam.add(pushok);

        for (int i = 0; i < petFam.size(); i++) {
            System.out.println(petFam.get(i).getInfo());
        }

        System.out.println();

        rimma.walkDog(rex);
        System.out.println("======");
        styopa.feedDog(rada);
        System.out.println("======");
        katya.feedCat(pushok);
        System.out.println("======");
        rex.wagTail();
        System.out.println();

        rimma.relatesTo(styopa);
        System.out.println();
        katya.relatesTo(petya);
    }
}

