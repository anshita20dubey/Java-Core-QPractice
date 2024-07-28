package PyqsJcm;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0) {
            System.out.println("not");
        }
        int[] factors = {2,3,5};
        for(int fact : factors){
            while (n%fact == 0){
                n /= fact;
            }
        }
        if(n == 1){
            System.out.println("hai");
        } else{
            System.out.println("nhi");
        }
    }
}
