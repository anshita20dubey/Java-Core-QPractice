package Inheritance;

class Parent{
    String address = "Indrapuri";
    void car(){
        System.out.println("KIA");
    }
}
class Children extends Parent{
    void phone(){
        System.out.println("MI");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Children obj1 = new Children();
        obj1.car();
    }
}
