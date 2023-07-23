import java.util.ArrayList;

public class OrderTest {
  
    public static void main (String[] args){
    
        //items 
        
        items  i1 = new items();
         i1.name="mocha";
         i1.price=5;

        items i2 = new items();
        i2.name="latte";
        i2.price=7.5;

        items i3=new items();
        i3.name="drip coffee";
        i3.price=9;

        items i4=new items();
        i4.name="capuccino";
        i4.price=4;

        //order
        Order o1=new Order();
        o1.name="Cindhuri";
        o1.total=i1.price;
        o1.reday=true;
        o1.items.add(i1);

        Order o2=new Order();
        o2.name="Jimmy";
        o2.total=i1.price;
        o2.reday=true;
        o1.items.add(i1);

        Order o3=new Order();
        o3.name="sam";
        o3.total=i4.price;
        o3.reday=true;
        o3.items.add( i4);

        Order o4=new Order();
        o4.name="Noah";
        o4.total=i4.price;
        o4.reday=true;
        o4.items.add(i4);
        o4.items.add(i2);

        System.out.printf("Name: %s\n", o1.name);
        // item name 
        System.out.printf("Item name: %s\n", o1.items.get(0).name);
        System.out.printf("Total: %s\n", o1.total);
        System.out.printf("Ready: %s\n", o1.reday);
    }
}


