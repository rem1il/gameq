package play;

public class Play {
    public static void main(String[] args) {
        King king = new King(200, 100);
        Army army = king.getArmy();

        Knight knight = new Knight();
        Infantry infantry = new Infantry();

        army.addKnight(knight);
        army.addInfantry(infantry);

        System.out.println("King's Health Points: " + king.getHealthPoints());
        System.out.println("King's Gold: " + king.getGold());

        for (Knight k : army.getKnights()) {
            System.out.println("Knight Health Points: " + k.getHealthPoints());
            System.out.println("Knight Damage: " + k.getDamage());
        }

        for (Infantry i : army.getInfantry()) {
            System.out.println("Infantry Health Points: " + i.getHealthPoints());
            System.out.println("Infantry Damage: " + i.getDamage());
        }
    }
}
