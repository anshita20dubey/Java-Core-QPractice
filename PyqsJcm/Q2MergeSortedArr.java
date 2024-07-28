package PyqsJcm;

import java.util.Arrays;

public class Q2MergeSortedArr {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        int counter = 0;
        for (int i = 0; i < m; i++) {
            nums1[counter] = nums1[i];
            counter++;
        }
        for (int i = 0; i < n; i++) {
            nums1[counter] = nums2[i];
            counter++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
