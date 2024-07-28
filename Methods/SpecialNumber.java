package Methods;

public class SpecialNumber {
    public static int sod(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 109;
        while (n > 9) {
            n = sod(n);
        }
        System.out.println(n == 1 ? "Special" : "Not special");

    }
}
