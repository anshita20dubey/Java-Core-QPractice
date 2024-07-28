package Recursion;

public class SumOfDigitWhile {
    static int summing(int n){
        if(n==0) return 0;
        return n%10 + summing(n/10);
    }
    public static void main(String[] args) {
        System.out.println(summing(54));
    }
}
