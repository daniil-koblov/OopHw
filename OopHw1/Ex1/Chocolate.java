package OopHw1.Ex1;

public class Chocolate extends Product {
    private final String type;

    public Chocolate(String name, Integer cost, String type){
        super(name, cost);

        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + this.type;
    }
    
}
