package PracticeSession;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender:");
        char gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter year of service:");
        int yearOfService = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter quality:");
        char qualify = sc.next().charAt(0);

        if(gender == 'M' || gender == 'm'){
            if(yearOfService >= 10 && qualify == 'p'){
                System.out.println("15K");
            } else if(yearOfService >= 10 && qualify == 'g'){
                System.out.println("10K");
            }  else if(yearOfService < 10 && qualify == 'p'){
                System.out.println("10K");
            } else if(yearOfService < 10 && qualify == 'g'){
                System.out.println("7K");
            }
        } else {
            if(yearOfService >= 10 && qualify == 'p'){
                System.out.println("12K");
            } else if(yearOfService >= 10 && qualify == 'g'){
                System.out.println("9K");
            }  else if(yearOfService < 10 && qualify == 'p'){
                System.out.println("10K");
            } else if(yearOfService < 10 && qualify == 'g'){
                System.out.println("6K");
            }
        }

    }
}
