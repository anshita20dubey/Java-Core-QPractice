package PracticeSession;

import java.util.*;

/*
     Given an array of integers, update every element with the multiplication of previous and next elements with the following exceptions.
     a) The First element is replaced by the multiplication of the first and second.
     b) The last element is replaced by multiplication of the last and second last.

     Example:
     Input  : arr[] = {2, 3, 4, 5, 6}
     Output : arr[] = {6, 8, 15, 24, 30}
*/
public class UpdateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6};
        int n = arr.length;
        int[] temp = new int[arr.length];
        temp[0] = arr[0] * arr[1];
        for (int i = 1; i < n - 1; i++) {
            temp[i] = arr[i - 1] * arr[i + 1];
        }
        temp[n - 1] = arr[n - 2] * arr[n - 1];
        System.out.println(Arrays.toString(temp));
    }
}
