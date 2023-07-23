package com.demo1;

public class Test {

    public String performOperation = "";
    public double number1=0;
    public double number2=0;

    public double number3=0;
    public double res;

    public Test() {

    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }



    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getPerformOperation() {
        return performOperation;
    }

    public void setPerformOperation(String performOperation) {
        this.performOperation = performOperation;
    }

    public double op() {
        if (performOperation == "+") {
        res=number1+number2;

        } else if (performOperation=="-") {
            res = number1 - number2;

        }
        else if (performOperation=="*"){


        } else if (performOperation=="/") {
            res=number1/number2;

//
//
        } else {
            System.out.println("There are somthing rong , reptet");

        }
        return res;
    }




}

