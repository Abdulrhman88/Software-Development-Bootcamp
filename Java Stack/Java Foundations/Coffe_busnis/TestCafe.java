import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args){
        
        CafeUtil coffeeApp = new CafeUtil();

        int r1 = coffeeApp.getStreakGoal();
        System.out.println(r1);

        double[] pr1 = {11, 7, 30.1, 1.2, 3.4};
        double total = coffeeApp.getOrderTotal(pr1);
        System.out.println(total);

        ArrayList<String> items = new ArrayList<String>();
        items.add("drip coffee");
        items.add("Cap");
        items.add("Late");
        coffeeApp.displayMenu(items);

        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Abdulrhman");
        customers.add("Saad");
        coffeeApp.addCustomer(customers);
    }
}