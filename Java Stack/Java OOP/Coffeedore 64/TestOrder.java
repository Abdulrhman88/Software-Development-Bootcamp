public class TestOrder{

public static void main(String[] args) {
        Coffe o1=new Coffe();
        o1.addMenuItem("Late", 3.5);
        o1.addMenuItem("Coffee",  5.5);
        o1.addMenuItem("Drip coffee", 7.1);
        o1.displayMenu();
        o1.newOrder();

    }
}