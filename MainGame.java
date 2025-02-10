import characters.*;
import combat.CombatManager;
import enemies.*;
import level.LevelManager;
import score.ScoreManager;
import items.*;

public class MainGame {
    public static void main(String[] args) {
        IWeapon sword = new Sword();
        IWeapon staff = new Staff();

        Character warrior = new Warrior("Arthas", sword);
        Character mage = new Mage("Gandalf", staff);

        LevelManager levelManager = new LevelManager();
        CombatManager combatManager = new CombatManager();
        ScoreManager scoreManager = new ScoreManager();

        // Спавн врагов
        IEnemy goblin = levelManager.spawnEnemy("Goblin");
        IEnemy dragon = levelManager.spawnEnemy("Dragon");

        // Битва
        combatManager.fight(warrior, goblin);
        scoreManager.addScore(50);

        combatManager.fight(mage, dragon);
        scoreManager.addScore(200);

        System.out.println("Final Score: " + scoreManager.getScore());
    }
}
