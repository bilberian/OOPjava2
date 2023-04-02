package OOPjava.HW2.Pets;

public abstract class Pet {
    protected String name;
    public int weight;
    
    public Pet(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getInfo() {
        return String.format("Name: %s, weight: %d", this.name, this.weight);
    }

    public String getName () {
        return this.name;
    }
}
