package Methods;

public class StrongNumber {
    public static int strong(int n) { // formal
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 145;
        int ans = strong(num); // actual

        System.out.println(num == ans ? "Strong" : "Not strong");
    }
}
