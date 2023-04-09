package OOPjava.HW4;

public class Sword implements Weapon {

    private String name;

    public Sword() {
        this.name = "supersword";
    }

    @Override
    public int damage() {
        return 15;
    }

    @Override
    public String toString() {
        return "Sword " + name;
    }
}
