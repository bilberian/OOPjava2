package OOPjava.HW3;

public class Relationship {

    public Bond bond;

    public Relationship(Bond bond) {
        this.bond = bond;
    }

    enum Bond {
        mother,
        father,
        daughter,
        son,
        husband,
        wife,
        brother,
        sister;
    }
}
