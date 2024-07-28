package Task3;
/*
   	 Find the frequency	of each	element	in the array
     Example 1:
     Input:
           n = 7
           arr[] = {1,	5,	3,	1,	3,	5,	6}
           Output:  1-2
					5-2
					3-2
					6-1
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] copy = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            copy[arr[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (copy[i] > 0) {
                System.out.println(i + " - " + copy[i]);
            }
        }
    }
}
