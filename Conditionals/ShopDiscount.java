package Conditionals;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        double per = 0;
        if (total > 5000 && total <= 7000) {
            per = 10;
        } else if (total > 7000 && total <= 10000) {
            per = 20;
        } else if (total > 10000) {
            per = 30;
        } else{
            System.out.println(total);
        }
        double discount = total * per / 100;
        double amt = total - discount;
        System.out.println("Your discount is:" + per);
        System.out.println(amt);
    }
}
