package Recursion;

public class HelloN {
    static void fun(int n){
        if(n==0) return;
        System.out.println("Hemlloo Duniya!!");
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(5);
    }
}
