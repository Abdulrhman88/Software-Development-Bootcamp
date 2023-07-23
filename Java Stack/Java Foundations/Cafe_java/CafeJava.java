public class CafeJava {
    public static void main(String[] args) {
    
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double coffePrice=5.5;
        double latePrice=7.5;
        double cappuccinoPrice=9.5;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2="Naah";
        String customer3="Sam ";
        String customer4="jamy ";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2=false;
        boolean isReadyOrder3=false;
        boolean isReadyOrder4=true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 ); // Displays "Welcome to Cafe Java, Cindhuri"

        if(isReadyOrder1)
        {
            System.out.println(generalGreeting + customer1 + pendingMessage + readyMessage + displayTotalMessage+ coffePrice );
        }
        else if(isReadyOrder2)
        {
            System.out.println(generalGreeting + customer2 + pendingMessage + readyMessage + displayTotalMessage+ cappuccinoPrice );
            
        }
        else if (isReadyOrder3)
        {
            System.out.println(generalGreeting + customer3 + displayTotalMessage+ (latePrice+latePrice) );  
            System.out.println(readyMessage);
        }
        else if (isReadyOrder4)
        {
            System.out.println(generalGreeting + customer4 + "Your order is coffee "+ displayTotalMessage + coffePrice );
            System.out.println(customer4 + " You Cansel the Coffe" + " and order latte and Your total price now is" +latePrice );
        }

        
    }
}
