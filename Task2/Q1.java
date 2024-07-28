package Task2;
import java.util.Random;
import java.util.Scanner;
/*
    Write a Java program for a Rock, Paper, Scissors game where the
    user plays against the computer. The program should repeatedly
    prompt the user for their choice (Rock, Paper, and Scissors) and display
    the winner of each round until the user decides to quit. The computer's
    choice should be randomly generated.
*/
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int user;
        do {
            System.out.println("Welcome to the game of RPS (^人^)");
            System.out.println("Choose: 1 - Rock\n2 - Paper\n3 - Scissor\n4 - Exit");
            user = sc.nextInt();
            if (user == 4) break;
            int comp = rc.nextInt(3) + 1;
            switch (comp) {
                case 1 -> System.out.println("Computer chose - Rock");
                case 2 -> System.out.println("Computer chose - Paper");
                case 3 -> System.out.println("Computer chose - Scissor");
            }
            if (user == comp) {
                System.out.println("Draw...!!");
            } else if ((user == 1 && comp == 3) || (user == 2 && comp == 1) || (user == 3 && comp == 2)) {
                System.out.println("YAYYYY..!! Winner, Winner...^_^");
            } else {
                System.out.println("Ahhhhaa...You lose the game...＞﹏＜");
            }
            System.out.println("Press 1 to repeat");
            user = sc.nextInt();
        } while (user == 1);
    }
}