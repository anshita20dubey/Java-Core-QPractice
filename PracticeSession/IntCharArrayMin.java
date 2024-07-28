package PracticeSession;

/*
     Given an integer array A[] and a character array B[] of equal lengths where every character of the array
     is from the set {‘a’, ‘b’, ‘c’}.
     Elements of both arrays are associated with each other i.e. the value of B[i] is linked to A[i] for all valid values of i.
     The task is to find the value min(a + b, c).

     Examples:
     Input: A[] = {3, 6, 4, 5, 6}, B[] = {‘a’, ‘c’, ‘b’, ‘b’, ‘a’}
     Output: 6
     Input: A[] = {4, 2, 6, 2, 3}, B[] = {‘b’, ‘a’, ‘c’, ‘a’, ‘b’}
     Output: 5
*/
public class IntCharArrayMin {
    public static void main(String[] args) {
        int[] A = new int[]{3, 6, 4, 5, 6};
        int[] B = new int[]{'a', 'c', 'b', 'b', 'a'};
        int sumA = 0, sumB = 0, sumC = 0;

        for (int i = 0; i < A.length; i++) {
            if(B[i] == 'a'){
                sumA = sumA + A[i];
            } else if(B[i] == 'b'){
                sumB = sumB + A[i];
            } else if(B[i] == 'c'){
                sumC = sumC + A[i];
            }
        }

        int result = Math.min((sumA+sumB), sumC);
        System.out.println(result);
    }
}
