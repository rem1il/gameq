package play;

public class King {
    private int healthPoints;
    private int gold;
    private Army army;

    public King(int initialHealth, int initialGold) {
        this.healthPoints = initialHealth;
        this.gold = initialGold;
        this.army = new Army();
    }

    public void decreaseHealth(int damage) {
        healthPoints -= damage;
    }

    public void decreaseGold(int amount) {
        gold -= amount;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getGold() {
        return gold;
    }

    public Army getArmy() {
        return army;
    }
}
