package LoopsSwitch;

import java.util.Scanner;

public class Q32Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        int check=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                check=1;
            }
        }
        if(check==0){
            System.out.println("Prime");
        } else{
            System.out.println("Not");
        }
    }
}
