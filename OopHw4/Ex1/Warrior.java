package OopHw4.Ex1;

import java.util.Random;

public abstract class Warrior{
    private String name;

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private Shield shield;

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    
    public Warrior(String name,  Weapon weapon, Shield shield, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, shield %s, healthPoint %d", name, weapon, shield, healthPoint);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int evasion(){
        Random random = new Random();
        return random.nextInt(shield.shieldProtection());
    }
}