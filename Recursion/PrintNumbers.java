package Recursion;

public class PrintNumbers {

    static void printN(int n){
        if(n==0) return;
        printN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printN(10);
    }
}
