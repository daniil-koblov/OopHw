package OopHw4.Ex1;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), new SpanishShield(), 30))
                    .add(new Archer("Bob", new Bow(), new SpanishShield(), 25));
        
        Team<Assassin> assasinTeam = new Team<>();
        assasinTeam.add(new Assassin("Ecio",new Knife(), new EnglishShield(), 20))
                   .add(new Assassin("Maria", new Knife(), new EnglishShield(), 35));

        Team<Warrior> aTeam = new Team<>();
        aTeam.add(new Assassin("Mario",new Knife(), new EnglishShield(), 40))
             .add(new Archer("Leonard", new Bow(), new SpanishShield(), 36))
             .add(new Samurai("Miyamoto", new Katana(), new NoShield(), 45));

        System.out.println("Archers Team\n");
        System.out.println(archersTeam + "\n");
        System.out.println("Assassin Team\n");
        System.out.println(assasinTeam + "\n");
        System.out.println("A Team\n");
        System.out.println(aTeam + "\n");

        System.out.println("Battle\n");

        Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), new SpanishShield(), 30), 
                               new Assassin("Jonny", new Knife(), new EnglishShield(), 34));
        Warrior winner = placeOfBattle.fight();
        System.out.println("\n" + winner);
    }
    
}