package Task3;
/*
    First Repeating	Element
    Given an array arr[] of	size n,	find the first repeating element. The
    element	should occur more than once	and	the	index of its first occurrence should be	the	smallest.
    Note:- The	position you return	should	be	according to 1-based indexing.
    Example	1:
    Input:
    n =	7
    arr[] =	{1,	5,	3,	4,	3,	5,	6}
    Output:	2
*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count = i;
                    break;
                }
            }
            if (count != -1) break;
        }
        System.out.println(count != -1 ? "index:" + (count + 1) : "not found");
    }
}
