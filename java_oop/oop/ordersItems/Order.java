import java.util.ArrayList;

public class Order {
    // MEMBER VARIABLES
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    // CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        this.total = 0.00;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }
}