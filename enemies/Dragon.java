package enemies;

public class Dragon implements IEnemy {
    private int health = 200;
    private int damage = 30;

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
