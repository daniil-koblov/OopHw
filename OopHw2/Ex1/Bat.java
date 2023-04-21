package OopHw2.Ex1;

public class Bat extends Predator implements Flyable{

    public Bat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pip-pip-pip";
    }

    @Override
    public String toString() {
        return String.format("Bat, %s", super.toString());
    }

    @Override
    public int speedForFly() {
        return 120;
    }

}
