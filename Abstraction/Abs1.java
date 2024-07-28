package Abstraction;

abstract class A {
    abstract protected void coffeeMachine();
    void fun(){
        System.out.println("chilling");
    }
}

abstract class B extends A {
    public void coffeeMachine() {
        System.out.println("Lattee");
    }
}

//public class Abs1 extends A{
public class Abs1 {
//    void coffeeMachine(){
//        System.out.println("Lattee");
//    }

    public static void main(String[] args) {
        Abs1 obj1 = new Abs1();
//        obj1.coffeeMachine();
    }
}
