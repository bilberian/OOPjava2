package OOPjava.HW4;

public class Archer extends Warrior<Throwing, Shield> {

    public Archer(String name, int hp, Throwing weapon, Shield shield) {
        super(name, hp, weapon, shield);
    }

    // public Archer(String name, int hp, Throwing weapon) {
    //     super(name, hp, weapon);
    //     shield.hardness = 0;
    // }

    public int getRange() {
        return rand.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer " + super.toString();
    }
}
