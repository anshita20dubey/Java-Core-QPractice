package PracticeSession;

import java.util.Scanner;

public class IndianCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt(); // 4500

        if(amt >= 500 ){
            System.out.println("500:"+amt/500);
            amt = amt%500;
        }
        if(amt >= 200){
            System.out.println("200:"+amt/200);
            amt = amt%200;
        }
        if(amt >= 100){
            System.out.println("100:"+amt/100);
            amt = amt%100;
        }
        if(amt>=50){
            System.out.println("50:"+amt/50);
            amt = amt%50;
        }
        if(amt>=20){
            System.out.println("20:"+amt/20);
            amt = amt%20;
        }
        if(amt>=10){
            System.out.println("10:"+amt/10);
            amt = amt%10;
        }
        if(amt>=5){
            System.out.println("5:"+amt/5);
            amt = amt%5;
        }
        if(amt>=2){
            System.out.println("2:"+amt/2);
            amt = amt%2;
        }
        if(amt>=1){
            System.out.println("1:"+amt/1);
            amt = amt%1;
        }
    }
}