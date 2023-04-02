package OOPjava.HW2.Pets;

public class Cat extends Pet {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    public String getInfo() {
        return String.format("Cat %s", super.getInfo());
    }

    public void act() {
        if (this.weight > 5) {
            System.out.println("falls asleep");
        } else {
            System.out.println("wants to play");
        }
    }
}
