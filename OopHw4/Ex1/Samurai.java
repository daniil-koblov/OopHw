package OopHw4.Ex1;

import java.util.Random;

public class Samurai extends Warrior{
    public Samurai(String name, Knife knife, int healthPoint) {
        super(name, knife, healthPoint);
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
