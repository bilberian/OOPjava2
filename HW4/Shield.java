package OOPjava.HW4;

public class Shield {

    protected int hardness;

    public Shield(int hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Shield hardness: " + hardness;
    }

}
