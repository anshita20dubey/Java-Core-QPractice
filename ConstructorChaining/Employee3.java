package ConstructorChaining;

class B {


    B() {
        System.out.println("parent cons");
    }
    B(int a) {
        System.out.println("parent cons");
    }
}

public class Employee3 extends B {
    Employee3() {
        super();// ye nhi bhi likhe to chlega kyuki ye apne aap chla dega parent ko default cons ko
//        super(10); if koi cons bnaya h to exclusively value dedo

        System.out.println("child cons");
    }

    public static void main(String[] args) {
        Employee3 obj1 = new Employee3();

    }
}
