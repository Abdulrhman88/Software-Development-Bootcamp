package com.demo1;

public class Test1 {
    public  static  void  main (String [] args){

        Test o = new Test();

        o.setNumber1(10.5);
        o.setPerformOperation("+");
        o.setNumber2(5.2);
        o.op();
        System.out.println(o.getRes());

    }
}
