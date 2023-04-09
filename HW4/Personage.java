package OOPjava.HW4;

public abstract class Personage {
    private String name;
    private int hp;

    public Personage(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void reduceHp(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
}
