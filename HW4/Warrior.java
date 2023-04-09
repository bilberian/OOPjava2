package OOPjava.HW4;

import java.util.Random;

public class Warrior<T extends Weapon, Sh extends Shield> extends Personage {

    protected T weapon;
    protected Sh shield;
    protected static Random rand = new Random();

    public Warrior(String name, int hp, T weapon, Sh shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    // public Warrior(String name, int hp, T weapon) {
    //     super(name, hp);
    //     this.weapon = weapon;
    //     this.shield.hardness = 0;
    // }

    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage() + 1);
        }
        return damage;
    }

    @Override
    public String toString() {
        return getName() + "; weapon: " + weapon + "; " + shield + "; hp: " + getHp();
    }

}
