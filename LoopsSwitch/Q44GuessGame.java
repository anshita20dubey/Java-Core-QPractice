package LoopsSwitch;

import java.util.Scanner;

public class Q44GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myGuess = (int) (Math.random() * 100) + 1;
        int maxGuess = 10;
        do {
            maxGuess--;
            System.out.println("Guess the number (1-100):");
            int userGuess = sc.nextInt();
            if (userGuess == myGuess) {
                System.out.println("Winner winner paneer dinner");
                break;
            }
            if(maxGuess ==0){
                System.out.println("Rehne de bhai");
                break;
            }
            if (userGuess > myGuess) {
                System.out.println("OOps too large thoda chota socho");
            } else {
                System.out.println("OOPS too small thoda bada socho");
            }
        } while (true);
    }
}
