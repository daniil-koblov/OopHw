package OopHw4.Ex1;

public class SpanishShield implements Shield{
    @Override
    public int shieldProtection(){
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Spanish shield, max protection %d", shieldProtection());
    }
}
