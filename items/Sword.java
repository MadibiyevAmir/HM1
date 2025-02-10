package items;

public class Sword implements IWeapon {
    @Override
    public void use() {
        System.out.println("Swinging sword!");
    }
}
