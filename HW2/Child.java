package OOPjava.HW2;

import OOPjava.HW2.Pets.*;

public class Child extends Parent {

    public Child(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public String getInfo() {
        return String.format("Child of %s ", super.getInfo());
    }

    public void feedDog(Dog target) {
        System.out.println(this.name + " feeds " + target.getName());
        target.weight += 2;
        System.out.println(target.getName() + "\'s weight is now " + target.weight + " kilos");
        System.out.print(target.getName() + " says ");
        target.bark();
    }

    public void feedCat(Cat target) {
        System.out.println(this.name + " feeds " + target.getName());
        target.weight += 1;
        System.out.println(target.getName() + "\'s weight is now " + target.weight + " kilos");
        System.out.print(target.getName() + " ");
        target.act();
    }

    @Override
    public void relatesTo(Person whom) {
        System.out.printf(this.name +" is a child to %s", whom.name);
    }

}
