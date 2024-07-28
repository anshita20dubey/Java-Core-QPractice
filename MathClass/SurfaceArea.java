package MathClass;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        // surfaceArea = 4 * pi * r^2
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.println("Surface Area of Sphere is: " + surfaceArea);
    }
}
