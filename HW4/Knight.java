package OOPjava.HW4;

public class Knight extends Warrior<Sword, Shield>{

    public Knight(String name, int hp, Sword weapon, Shield shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return "Knight " + super.toString();
    }
}
