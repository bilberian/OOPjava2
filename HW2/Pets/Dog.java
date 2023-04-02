package OOPjava.HW2.Pets;

public class Dog extends Pet implements WagTail{

    public Dog(String name, int weight) {
        super(name, weight);
    }

    public String getInfo() {
        return String.format("Dog %s", super.getInfo());
    }

    public void bark() {
        if (this.weight >= 10) {
            System.out.println("wuuuuuuuf");
        } else {
            System.out.println("Wuf-Wuf!");
        }
    }

    public void wagTail() {
        System.out.println(this.name + " wags its tail");
    }
}