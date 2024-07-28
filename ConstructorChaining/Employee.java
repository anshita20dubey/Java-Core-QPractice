package ConstructorChaining;

// Constructor Chaining in same class
public class Employee {
    Employee() {
        this(10); // t man we are calling default cons
        System.out.println("Default");
    }

    Employee(int a) {
        this(a,"anshita");
        System.out.println("integer : " + a);
    }

    Employee(int a, String name) {
        System.out.println(name + " = " + a);
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
    }
}
