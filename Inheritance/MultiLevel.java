package Inheritance;

class GrandParent{
    void jameen(){
        System.out.println("100 acre");
    }
}
class Parent2 extends GrandParent{
    String address = "Indrapuri";
    void car(){
        System.out.println("KIA");
    }
}
class Children2 extends Parent2{
    void phone(){
        System.out.println("MI");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Children2 obj1 = new Children2();
        obj1.car();
        obj1.jameen();
    }
}
