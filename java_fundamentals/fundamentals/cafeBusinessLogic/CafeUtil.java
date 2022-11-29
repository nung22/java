import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    //  METHODS 
    public int getStreakGoal() {
        int numWeeks = 10;
        int weeks = 0;
        for(int i = 0; i <= numWeeks; i++) {
            weeks += i;
        }
        return weeks;
    }
    public int getStreakGoal(int numWeeks) {
        int weeks = 0;
        for(int i = 0; i <= numWeeks; i++) {
            weeks += i;
        }
        return weeks;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price: prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s%n", i, menuItems.get(i));
        }
        System.out.println();
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.printf("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ",userName);
        System.out.printf("There are %s people ahead of you.\n",customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%s - $%.2f%n", i, price * i - .5 * (i-1));
        }
        System.out.println();
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if(menuItems.size() != prices.size()) {
            return false;
        }
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s -- $%.2f%n", i, menuItems.get(i), prices.get(i));
        }
        System.out.println();
        return true;
    }

    public void addCustomers(ArrayList<String> customers) {
        String userName;
        while (true) {
            System.out.printf("Please enter customer name (press \"q\" to quit): ");
            userName = System.console().readLine();
            if(userName.equals("q")) {
                break;
            }
            customers.add(userName);
        }
        System.out.printf("%nThere are %s people in line.\n",customers.size());
        System.out.println(customers);
        System.out.println();
    }
}