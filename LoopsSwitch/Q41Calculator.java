package LoopsSwitch;

import java.util.Scanner;

public class Q41Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("Saste Calculator me swagat hai -> ");
            System.out.println("1-Addition\n2 - Multiplication\n3 - Division\n4 - Exit");
            System.out.println("ENTER:");
            ch =sc.nextInt();
            if(ch==1){
                //add
                System.out.println("Do number dedo:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("sum: "+(a+b));
            } else if(ch==2){
                //multiply
                System.out.println("Do number dedo:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Multiply: "+(a*b));
            } else if(ch==3){
                //division
                System.out.println("Do number dedo:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Division: "+(a/b));
            } else{
                break;
            }
//            System.out.println("Press 1 to repeat");
//            ch= sc.nextInt();
        } while (true);
    }
}
