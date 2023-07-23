public class BarestaTest {

    public static void main (String[] args){

        
  //items menu 
  Item item1=new Item("Late", 5.5);
  Item item2=new Item("Coffee", 7.5);
  Item item3=new Item("Late", 10.5);


  //Order

  Order o1=new Order();

  Order o2=new Order();

  Order o3= new Order("Mohammed");
  o3.addItem(item1);

  o3.setReady(true);
  o3.getStatusMessage();
  System.out.println(o3.getOrderTotal());  
  o3.display();

Order o4 = new Order("Saad");
  o4.addItem(item2);
  o4.getStatusMessage();
  System.out.println(o4.getOrderTotal()); 
  o4.display();
  

  Order o5= new Order("Abdulrhman");



    }
    
}
