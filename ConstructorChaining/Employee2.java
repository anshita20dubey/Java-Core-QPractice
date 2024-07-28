package ConstructorChaining;
// super keyword -> parent class ki chizo ko access krne ke liye....other class h koi
class A {
    int age;
    void fun(){
        System.out.println("hello world");
    }
}

public class Employee2 extends A{
    void greet(int a){
        super.age = a;
        System.out.println(super.age);
        super.fun();
    }
    public static void main(String[] args) {
        Employee2 obj1 = new Employee2();
        obj1.greet(10);
    }
}
