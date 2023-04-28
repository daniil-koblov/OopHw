package OopHw4.Ex1;

import java.util.Random;

public class Assassin extends Warrior{

    public Assassin(String name, Knife knife, EnglishShield englishShield, int healthPoint) {
        super(name, knife, englishShield, healthPoint);
    }

    int range(){
        Random random = new Random();
        return random.nextInt(getWeapon().range());
    }
    
    @Override
    public String toString() {
        return String.format("Assassin %s", super.toString());
    }
}