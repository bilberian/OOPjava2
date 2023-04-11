package OOPjava.HW3;

import OOPjava.HW3.Relationship.*;


public class Program {
    public static void main(String[] args) {
        Person styopa = new Person(11, "Styopa", 15);
        Person masha = new Person(14, "Masha", 8);
        Person marina = new Person(1, "Marina", 35);
        Person petya = new Person(2, "Petya", 44);

        Family<Person> semenovy = new Family<>("Semenovy");
        semenovy.addMember(styopa).addMember(masha).addMember(marina).addMember(petya);
        // System.out.println(semenovy); - как сделать, чтобы при таком вызове не
        // печатались хэшкоды?
        System.out.println(semenovy.getLastName() + ": ");
        for (Person a : semenovy) {
            System.out.print(a.getInfo() + ", ");
        }

        System.out.println();
        System.out.println();

        styopa.relatesTo(Bond.son, marina);
        styopa.relatesTo(Bond.brother, masha);
        marina.relatesTo(Bond.wife, petya);
        marina.relatesTo(Bond.mother, styopa);
        System.out.println();

        styopa.isMember(semenovy);
    }
}
