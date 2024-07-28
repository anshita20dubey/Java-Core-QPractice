package PracticeSession;

import java.util.*;

public class SubjectPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math = sc.nextInt();
        int sst = sc.nextInt();
        int eng = sc.nextInt();
        int hin = sc.nextInt();

        double percent = (double) (math+sst+eng+hin)/4;
        System.out.println(percent);

        if(percent >= 90 && percent <= 95){
            System.out.println("A+");
        }  else if(percent >= 85 && percent <= 90){
            System.out.println("A");
        } else if(percent >= 80 && percent <= 85){
            System.out.println("B+");
        }  else if(percent >= 75 && percent <= 80){
            System.out.println("B");
        }  else if(percent >= 70 && percent <= 75){
            System.out.println("C+");
        }  else if(percent >= 65 && percent <= 70){
            System.out.println("C");
        } else if(percent >= 60 && percent <= 65){
            System.out.println("D+");
        } else if(percent >= 55 && percent <= 60){
            System.out.println("D");
        } else if(percent >= 50 && percent <= 55){
            System.out.println("E");
        } else if(percent<50){
            System.out.println("F");
        } else{
            System.out.println("Invalid input");
        }


    }
}