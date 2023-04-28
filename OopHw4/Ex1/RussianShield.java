package OopHw4.Ex1;

public class RussianShield implements Shield {
    @Override
    public int shieldProtection() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Russian shield, max protection %d", shieldProtection());
    }
}
