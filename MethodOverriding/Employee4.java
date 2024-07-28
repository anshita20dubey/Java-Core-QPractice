package MethodOverriding;

// when multiple methods of same name but exist in different class
class D {
    void greet() {
        System.out.println("GM");
    }

}

class C extends D {
    void greet() {
        System.out.println("GM");
    }

}

public class Employee4 extends C {
    void greet() {
        System.out.println("GE");
    }

    public static void main(String[] args) {
        Employee4 obj1 = new Employee4();
        obj1.greet();
    }
}
