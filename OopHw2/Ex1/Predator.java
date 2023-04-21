package OopHw2.Ex1;

public abstract class Predator extends Animal {
    public Predator(String name) {
        super(name);
    }
    public String feed(){
        return "meat";
    }

}