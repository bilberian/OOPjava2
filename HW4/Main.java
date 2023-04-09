package OOPjava.HW4;

public class Main {
    public static void main(String[] args) {

        Archer arch1 = new Archer("Robin", 30, new Bow(50), new Shield(0));
        Archer arch2 = new Archer("Remlin", 30, new Bow(40), new Shield(5));

        Knight kn1 = new Knight("Arthur", 50, new Sword(), new Shield(10));
        Knight kn2 = new Knight("Gregor", 50, new Sword(), new Shield(8));

        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();

        archers.addPlayers(arch1)
                .addPlayers(arch2)
                .addPlayers(new Archer("Tilda", 30, new Bow(30), new Shield(4)));

        knights.addPlayers(kn1)
                .addPlayers(kn2)
                .addPlayers(new Knight("William", 50, new Sword(), new Shield(12)));

        System.out.println(arch1);
        System.out.println(kn2);
        System.out.println();
        System.out.println("Archers max range is: " + archers.maxRange());
        System.out.println("Knights' shields' min hardness is: " + knights.minShield());
        System.out.println();

        Battle fight = new Battle(arch1, kn2);
        fight.run();
    }
}
