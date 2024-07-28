package Inheritance;
class Animal{
    void sleep(){
        System.out.println("sleeping");
    }
    void eat(){
        System.out.println("Eating");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("roaring");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("barking");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.eat();

        Dog obj2 = new Dog();
        obj2.sleep();
    }
}
