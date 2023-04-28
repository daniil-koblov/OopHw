package OopHw4.Ex1;

import java.util.Random;

public abstract class Warrior<T extends Weapon, S extends Shield> {
    private String name;

    protected T weapon;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    protected S shield;

    public S getShield() {
        return shield;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Warrior(String name, T weapon, T Shield, int healthPoint) {
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