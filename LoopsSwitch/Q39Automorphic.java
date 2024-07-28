package LoopsSwitch;

import java.util.Scanner;

public class Q39Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int copy = n;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        long square = copy * copy;
        long lastdigits = copy % (long) Math.pow(10, count);

        System.out.println(lastdigits == copy ? "Automorphic..." : "Nhi hai...");
        // int cod = (int) (Math.log10(n))+1;
    }
}
