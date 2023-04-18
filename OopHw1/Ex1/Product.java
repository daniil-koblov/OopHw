package OopHw1.Ex1;

public class Product {
    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    private String name;

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    private Integer cost;


    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name + " " + this.cost;

    }
}