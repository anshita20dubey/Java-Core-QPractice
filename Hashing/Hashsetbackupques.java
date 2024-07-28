package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Hashsetbackupques {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 2, 1, 1, 3, 1, 4, 4, 5, 6, 2, 2, 7};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(set);

    }
}
