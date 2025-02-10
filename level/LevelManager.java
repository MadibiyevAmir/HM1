package level;
import enemies.*;

public class LevelManager {
    public IEnemy spawnEnemy(String type) {
        return switch (type) {
            case "Goblin" -> new Goblin();
            case "Dragon" -> new Dragon();
            default -> null;
        };
    }
}
