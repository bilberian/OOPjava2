package OOPjava.HW4;

public class Bow extends Throwing{
    private String name;

    public Bow(int distance) {
        super(distance);
        this.name = "bow";
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Bow " + name;
    }
}
