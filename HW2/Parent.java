package OOPjava.HW2;

import OOPjava.HW2.Pets.Dog;

public class Parent extends Person implements GeoTree{
    protected Gender gender;

    public Parent(String name, int age, Gender gender) {
        super(name, age);
        this.gender = gender;
    }

    public String getInfo() {
        return String.format("Parent %s, gender: %s", super.getInfo(), this.gender);
    }

    public void walkDog(Dog target) {
        System.out.println(this.name + " walks " + target.getName());
        target.weight -= 2;
        System.out.println(target.getName() + "\'s weight is now " + target.weight + " kilos");
        System.out.print(target.getName() + " says ");
        target.bark();
    }

    enum Gender {
        male,
        female;
    }

    public void relatesTo(Person whom) {
        System.out.printf(this.name +" is a parent to %s", whom.name);
    }
}
