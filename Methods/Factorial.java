package Methods;

public class Factorial {
    public static int factorials(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int a = 5,b=6;
        System.out.println(Factorial.factorials(a));
        System.out.println(factorials(b)); // bina class ka name  use kiye bhi likh skte hai
    }
}
