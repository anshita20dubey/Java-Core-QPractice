package MathClass;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal:");
        double principal = sc.nextDouble();
        System.out.println("Enter time:");
        int time = sc.nextInt();
        System.out.println("Enter rate:");
        double rate = sc.nextDouble();
        double amt = principal * Math.pow((1 + (rate / 100)), time);
        System.out.println("Amount is:" + amt);
    }
}
