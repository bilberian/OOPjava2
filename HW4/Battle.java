package OOPjava.HW4;

public class Battle {
    private Warrior<?, ?> attacker;
    private Warrior<?, ?> defender;

    public Battle(Warrior<?, ?> attacker, Warrior<?, ?> defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior<?, ?> run() {
        while (true) {
            int attack = attacker.harm();
            if (defender.shield.hardness > 0) {
                reduceHardness(defender.shield, attack);
                System.out.printf(
                        "Warrior %s has attacked warrior %s with damage %d\n Warrior %s has now %d hp and his shield is now %d\n",
                        attacker.getName(), defender.getName(), attack, defender.getName(), defender.getHp(),
                        defender.shield.hardness);
            } else if (defender.shield.hardness == 0) {
                defender.reduceHp(attack);
                System.out.printf(
                        "Warrior %s has attacked warrior %s with damage %d\n Warrior %s has now %d hp\n",
                        attacker.getName(), defender.getName(), attack, defender.getName(), defender.getHp());
                if (!defender.isAlive()) {
                    System.out.printf("Warrior %s is dead. The winner is %s", defender.getName(), attacker);
                    return attacker;
                }
            }

            attack = defender.harm();
            if (attacker.shield.hardness > 0) {
                reduceHardness(attacker.shield, attack);
                System.out.printf(
                        "Warrior %s has attacked warrior %s with damage %d\n Warrior %s has now %d hp and his shield is now %d\n",
                        defender.getName(), attacker.getName(), attack, attacker.getName(), attacker.getHp(),
                        attacker.shield.hardness);
            } else if (attacker.shield.hardness == 0 || attacker.shield == null) {
                attacker.reduceHp(attack);
                System.out.printf(
                        "Warrior %s has attacked warrior %s with damage %d\n Warrior %s has now %d hp\n",
                        defender.getName(), attacker.getName(), attack, attacker.getName(), attacker.getHp());
                if (!attacker.isAlive()) {
                    System.out.printf("Warrior %s is dead. The winner is %s", attacker.getName(), defender);
                    return defender;
                }
            }
        }
    }

    public int reduceHardness(Shield shield, int damage) {
        if (damage == 0) {
            shield.hardness = shield.hardness;
        } else {
            shield.hardness -= 1;
        }
        return shield.hardness;
    }
}
