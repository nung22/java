import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("drip coffee", 2.50);
        Item item3 = new Item("latte", 3.30);
        Item item4 = new Item("cappuccino", 3.40);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindihuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Application Simulations

        // Print the order1 variable to the console to see what happens.
        System.out.println(order1);
        // Print order1.total
        System.out.println(order1.total);
        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Item List: %s\n\n", order2.items);
        // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Item List: %s\n\n", order3.items);
        // order4 added a latte. Update accordingly.
        order4.items.add(item3);
        order4.total += item3.price;
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Item List: %s\n\n", order4.items);
        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n\n", order1.ready);
        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item3);
        order4.items.add(item3);
        order4.total += item3.price;
        order4.total += item3.price;
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %.2f\n", order4.total);
        System.out.printf("Item List: %s\n\n", order4.items);
        // Cindhuri’s order is now ready. Update her status.
        order2.ready = true;
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n\n", order2.ready);
    }
}
