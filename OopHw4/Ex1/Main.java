package OopHw4.Ex1;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), 30))
                    .add(new Archer("Bob", new Bow(), 25));
        
        Team<Assassin> assasinTeam = new Team<>();
        assasinTeam.add(new Assassin("Ecio",new Knife(), 20))
                    .add(new Assassin("Maria", new Knife(), 35));

        System.out.println(archersTeam);
        System.out.println(assasinTeam);
        
        Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), 30), 
                               new Assassin("Jonny", new Knife(), 34));
        Warrior winner = placeOfBattle.fight();

        System.out.println(winner);
    }
    
}