package MathClass;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        // Circumference = 2 * pi * r
        // Area = pi * r^2

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Circumference of circle is: " + circumference);
        System.out.println("Area of circle is: " + area);
    }
}
