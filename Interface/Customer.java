package Interface;

interface father {
    void padhaikro();
    static void koi(){
        System.out.println("access kr pa rhi hu....100% security nhi h");
    }
    default void fun(){
        System.out.println("directly bina obj bnaye access");
    }
}
interface mother extends father{
    void padhaikro();
}

public class Customer implements mother,father {
    public void padhaikro() {
        fun();
        System.out.println("Pd rha hu");
    }

    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.padhaikro();
        father.koi();
    }
}
