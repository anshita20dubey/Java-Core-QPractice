package Task1;
import java.util.Scanner;
/*
    Create a program that takes a student's score as input and assigns a letter
    grade (A, B, C, D, or F) based on a grading scale.
    90 - 100 -> A || 75 - 90 -> B || 60 - 75 -> C || 50 - 60 ->D  || 35 - 50 -> E || less than 35 -> fail
    Example 1:  score : 90  ,  Output : A
*/
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the scores of the student:");
        int eng = sc.nextInt(), phys = sc.nextInt(), chem = sc.nextInt(), maths = sc.nextInt();

        double percent = (double) (eng + phys + chem + maths) / 4;
        System.out.println("Your percentage is: " + percent);
        if (percent > 90 && percent <= 100){
            System.out.println("Your Grade is: A");
        } else if(percent > 75 && percent <= 90){
            System.out.println("Your Grade is: B");
        } else if(percent > 60 && percent <= 75){
            System.out.println("Your Grade is: C");
        } else if(percent > 50 && percent <= 60){
            System.out.println("Your Grade is: D");
        } else if(percent > 35 && percent <= 50){
            System.out.println("Your Grade is: E");
        } else if(percent <= 35){
            System.out.println("Fail...!!");
        }

    }
}
