package OOPjava.HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T> {
    List<T> players = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return players.iterator();
    }

    public Team<T> addPlayers(T personage) {
        players.add(personage);
        return this;
    }

    @Override
    public String toString() {
        return "Team [players=" + players + "]";
    }

    public int maxRange() {
        int maxRange = 0;
        for (T personage : this) {
            if (personage instanceof Archer) {
                Archer archer = (Archer) personage;
                if (archer.getRange() > maxRange) {
                    maxRange = archer.getRange();
                }
            }
        }
        return maxRange;
    }

    public int minShield() {
        int minShield = 100;
        for (T person : this) {
            if (person instanceof Warrior) {
                Warrior<?, ?> warrior = (Warrior<?, ?>) person;
                if (warrior.shield.hardness < minShield) {
                    minShield = warrior.shield.hardness;
                }
            }
            // if (person instanceof Archer) {
            //     Archer archer = (Archer) person;
            //     if (archer.shield.hardness < minShield) {
            //         minShield = archer.shield.hardness;
            //     }
            // }
        }
        return minShield;

    }
}
