package combat;
import characters.Character;
import enemies.IEnemy;

public class CombatManager {
    public void fight(Character player, IEnemy enemy) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            player.attack();
            enemy.takeDamage(20);
            if (enemy.getHealth() > 0) {
                player.takeDamage(enemy.getDamage());
            }
        }
    }
}
