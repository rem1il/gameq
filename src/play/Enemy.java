package play;

public class Enemy {
    private int damage;
    private int goldReward;

    public Enemy(int damage, int goldReward) {
        this.damage = damage;
        this.goldReward = goldReward;
    }

    public int getDamage() {
        return damage;
    }

    public int getGoldReward() {
        return goldReward;
    }
}
