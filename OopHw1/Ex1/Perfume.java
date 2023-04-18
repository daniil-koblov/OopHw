package OopHw1.Ex1;

public class Perfume extends Product{

    private final String brand;
    public Perfume(String name, Integer cost, String brand) {
        super(name, cost);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + this.brand;
    }
}
