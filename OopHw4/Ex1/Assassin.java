package OopHw4.Ex1;

public class Assassin extends Warrior<Knife, EnglishShield>{

    public Assassin(String name, Knife knife, EnglishShield englishShield, int healthPoint) {
        super(name, knife, englishShield, healthPoint);
    }
    
    @Override
    public String toString() {
        return String.format("Assassin %s", super.toString());
    }
}