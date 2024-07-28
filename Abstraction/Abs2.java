package Abstraction;

abstract class A1 {
    abstract protected void coffeeMachine();
    void fun(){
        System.out.println("chilling");
    }
    A1(){
        System.out.println("A ka constructor");
    }

}
public class Abs2 extends A1 {
    protected void coffeeMachine() {
        System.out.println("Lattee");
    }
    Abs2() {
        System.out.println("child ka constructor");
    }

    public static void main(String[] args) {
        Abs2 obj = new Abs2();
        obj.coffeeMachine();
        obj.fun();
    }
}
