package enemies;

public class Goblin implements IEnemy {
    private int health = 50;
    private int damage = 10;

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
