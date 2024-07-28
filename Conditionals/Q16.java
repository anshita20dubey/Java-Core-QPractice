package Conditionals;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + ", you are eligible to vote!");
        } else {
            System.out.println("Hello " + name + ", you will be able to vote in " + (18 - age) + " years!");
        }
    }
}
