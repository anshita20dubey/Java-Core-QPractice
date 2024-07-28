package ExceptionHandling;

import java.util.Scanner;

public class SelfException {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age<18){
            throw new Exception("chle ja bhsdk");
        } else {
            System.out.println("Jao aage bado");
        }
        System.out.println("Hello World");


    }
}
