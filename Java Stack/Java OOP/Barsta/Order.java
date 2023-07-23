import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    
    // CONSTRUCTOR

    public Order() {

         // No arguments, sets name to "Guest", initializes items as an empty list.

         name="Guest";

         //items = new ArrayList  <Item>();
    }


        // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    

    public Order(String name) {
        this.name = name;
        items = new ArrayList  <Item>();

    }


    // GETTERS & SETTERS

    public String getName() {
        return name;
    }


    public boolean isReady() {
        return ready=true;
    }


    public ArrayList<Item> getItems() {
        return items;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setReady(boolean ready) {
        this.ready = ready;
    }


    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    // ORDER METHODS
    
    // Most of your code will go here, 
    public void addItem(Item item){
        this.items.add(item);
    }

    public void getStatusMessage(){

        if(this.ready=true){
         System.out.print("Your order is ready");
        }
        else if(this.ready=false){
        System.out.println("Thank you for waiting. Your order will be ready soon.");
        }
      
        

                
    }

    public double getOrderTotal(){
        double sum = 0.0;
        for(Item x : items){
            sum += x.getPrice();
        }
        return sum ;
    }

    public void display (){
        System.out.println("Custmer name :" + this.name);
       for(Item x:items){
        System.out.println(x.getName()+" - $ "+x.getPrice());
       }
        System.out.println("Total: $"+this.getOrderTotal());
    }
    
    
    
}