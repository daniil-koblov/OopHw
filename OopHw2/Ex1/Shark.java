package OopHw2.Ex1;

public class Shark extends Predator implements Swimable {
    public Shark(String name){
        super(name);
    }

    @Override
    public String say() {
        return "<Jaws are chattering nearby>";
    }

    @Override
    public int speedForSwim() {
        return 60;
    }
}
