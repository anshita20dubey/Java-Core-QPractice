package Task1;
import java.util.Scanner;
/*
     Given an integer n, return a string answer where:
         answer == "FizzBuzz" if i is divisible by 3 and 5.
         answer == "Fizz" if i is divisible by 3.
         answer == "Buzz" if i is divisible by 5.
         answer == i (as a string) if none of the above conditions are true.[Hint : String.valueOf(1) convert
        int 1 to “1” as string]
      Example 1:
      Input: n = 3 , Output: "Fizz"
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n = sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%3 == 0){
            System.out.println("Fizz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(String.valueOf(1));
        }
    }
}
