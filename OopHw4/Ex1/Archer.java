package OopHw4.Ex1;

import java.util.Random;

public class Archer extends Warrior{
    public Archer(String name, Bow bow, SpanishShield spanishShield, int healthPoint) {
        super(name, bow, spanishShield, healthPoint);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(getWeapon().range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}