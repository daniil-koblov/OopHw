package OopHw4.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warrior>{
    List<T> team = new ArrayList<>();
    public Team<T> add(T warriorT){
        team.add(warriorT);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for(T itemT: team){
            warriors.append(itemT);
            warriors.append("\n");
        }
        warriors.append(String.format("healthPoint %s, damage %s, max range %s, min Shield Protect %s", healthPoints(), getDamage(), maxRange(), 
                                        minShieldProtect()));
        return warriors.toString();
    }

    public int healthPoints(){
        int sum = 0;
        for(T itemT : team){
            sum += itemT.getHealthPoint();
        }
        return sum;
    }
    public int getDamage(){
        int sum = 0;
        for(T itemT: team){
            sum += itemT.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange(){
        int max = 0;
        for(T itemT: team){
            if(itemT instanceof Warrior){
                if(max < (itemT.getWeapon().range())){
                    max = (itemT.getWeapon().range());
                }
            }
        }
        return max;
    }
    
    public int maxShieldProtect(){
        int max = 0;
        for(T itemT: team){
            if(itemT instanceof Warrior){
                if(max < (itemT.getShield().shieldProtection())){
                    max = (itemT.getShield().shieldProtection());
                }
            }
        }
        return max;
    }

    public int minShieldProtect(){
        int min = maxShieldProtect();
        for(T itemT: team){
            if(itemT instanceof Warrior){
                if(min > (itemT.getShield().shieldProtection())){
                    min = (itemT.getShield().shieldProtection());
                }
            }
        }
        return min;
    }
}