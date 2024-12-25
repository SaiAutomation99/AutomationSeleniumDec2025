package com.interfaceTest;

public interface InterfaceDemo {

    public abstract void m1();
     


}

class InterfaceClass implements InterfaceDemo{
    public void m1(){

        System.out.println("interface");
    }

}
class ChildClass extends InterfaceClass{

    public static void main(String[] args) {
        ChildClass childclass=new ChildClass();
        childclass.m1();
    }
    
  

    
}
