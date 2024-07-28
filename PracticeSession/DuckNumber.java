package PracticeSession;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int check = 0;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }

        if (count != 3) {
            System.out.println("Invalid");
        } else {
            while (copy > 0) {
                int rem = copy % 10;
                if (rem == 0) {
                    check = 1;
                    break;
                }
                copy = copy / 10;
            }
            if(check==1){
                System.out.println("duck");
            } else{
                System.out.println("nhi");
            }
        }
    }
}