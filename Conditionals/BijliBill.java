package Conditionals;

import java.util.Scanner;

public class BijliBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double amt = 0;

        if(units > 400){
            amt = amt + (units-400) * 13;
            units = 400;
        }
    }
}
