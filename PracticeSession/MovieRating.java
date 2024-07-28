package PracticeSession;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rating = sc.nextDouble();
        sc.nextLine();
        String movie = sc.nextLine();


        if(rating <= 2.0 && rating >= 0.0){
            System.out.println("flop");
        } else if (rating <= 3.4 && rating >= 2.1) {
            System.out.println("Semi-hit");
        } else if (rating <= 4.5 && rating >= 3.5) {
            System.out.println("hit");
        } else if (rating <= 5.0 && rating >= 4.6) {
            System.out.println("super hit");
        } else{
            System.out.println("invalid");
        }
    }

    public static class Array0Count {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {2, 7, 11, 15};
            int target = 9;
            int check = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("found at " + i + " at " + j + " and the elements are " + arr[i] + " & " + arr[j]);
                        check = 9999;
                        break;
                    }
                }
                if(check!=0){
                    break;
                }
            }
            if(check==0){
                System.out.println("Combination hai hi nhi bhadve");
            }
        }
    }
}