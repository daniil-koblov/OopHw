package OopHw2.Ex1;

public abstract class Herbivores extends Animal{
    public Herbivores(String name) {
        super(name);
    }
    public String feed(){
        return "grass";
    }
}