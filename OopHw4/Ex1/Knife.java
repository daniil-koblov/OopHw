package OopHw4.Ex1;

public class Knife implements Weapon {
    @Override
    public int damage() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Knife, max damage %d", damage());
    }
}