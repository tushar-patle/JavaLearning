package com.tushar;

public class Vid53_AbstractClasAndAbstractMethods {
    public static void main(String[] args) {
        //GrandChild2 objGrandChild2 = new GrandChild2(); //you cannot istantiate object of an abs class
        Child2 objGrandChild2 = new Child2();
        objGrandChild2.greet();
    }
}

abstract class Parent2 {
    public Parent2() {
        System.out.println("I am Base2 constructor.");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good Morning.");    
    }
}

abstract class GrandChild2 extends Parent2 {
    public void methodname() {
        System.out.println("MethodName");
    }
}