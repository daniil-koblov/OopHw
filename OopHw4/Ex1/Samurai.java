package OopHw4.Ex1;

import java.util.Random;

public class Samurai extends Warrior{
    public Samurai(String name, Katana katana, NoShield noShield, int healthPoint) {
        super(name, katana, noShield, healthPoint);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(getWeapon().range());
    }

    @Override
    public String toString() {
        return String.format("Samurai %s", super.toString());
    }
}
