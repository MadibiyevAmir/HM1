package characters;
import items.IWeapon;

public abstract class Character {
    protected String name;
    protected int health;
    protected IWeapon weapon;

    public Character(String name, int health, IWeapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void attack() {
        weapon.use();
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }
}
