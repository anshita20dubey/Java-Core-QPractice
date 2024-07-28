package LoopsSwitch;

import java.util.Scanner;

public class Q42Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int day = sc.nextInt();

        String res = switch (day) {
            case 1 -> {
                yield "Monday";
                // yield return krta h hmesha ek return me value mangta h
            }
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input";
        };

        System.out.println(res);


    }
}
