package Task3;
/*
       Plus	One
       You	are	given	a	large	integer	represented	as	an	integer	array	digits, where each digits[i] is the ith digit of the integer.
       The digits are ordered from most significant to least
       significant	in	left-to-right order. The large integer does	not	contain	anyleading	0's.
       Increment the large integer	by	one	and	return	the	resulting array	of	digits.
       Example 1:
       Input: digits = [1,2,3]
       Output: [1,2,4]
*/
import java.util.Arrays;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        System.out.println(Arrays.toString(newDigits));
    }
}
