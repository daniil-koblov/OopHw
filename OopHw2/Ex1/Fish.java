package OopHw2.Ex1;

public class Fish extends Herbivores implements Swimable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pi-pi-pi";
    }

    @Override
    public String toString() {
        return String.format("Fish, %s", super.toString());
    }

    @Override
    public int speedForSwim() {
        return 25;
    }
}
