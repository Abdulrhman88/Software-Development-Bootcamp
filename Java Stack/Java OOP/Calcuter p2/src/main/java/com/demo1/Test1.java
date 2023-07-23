package com.demo1;

public class Test1 {
    public  static  void  main (String [] args){

        Test o = new Test();

        o.setNumber1(10.5);
        o.setPerformOperation("+");
        o.setNumber2(5.2);
        o.setPerformOperation("*");
      o.setNumber3(10);
        o.op();
        System.out.println(o.getRes());

//● performOperation(10.5);

//● performOperation("+")
//
//● performOperation(5.2)
//
//● performOperation("*")
//
//● performOperation(10)
//
//● performOperation("=")
//
//● getResults()
    }
}
