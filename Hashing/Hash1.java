package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// ek array h jisme se sirf unique elements print krne h
public class Hash1 {
    public static void main(String[] args) {
        // from arraylist
        int arr[] = {1,2,4,5,6,3,2,5,48,9,6,1,3};
        ArrayList<Integer> uniq = new ArrayList<>();
        for(int elem : arr){
            if(!uniq.contains(elem)){
                uniq.add(elem);
            };
        }
        System.out.println(uniq);

        // from hashset
        Set<Integer> uniq1 = new HashSet<>();
        for(int elem : arr) uniq1.add(elem);
        System.out.println(uniq1);

        // traversal
        Set<Integer> uniq2 = new HashSet<>();
        for(int elem : arr) uniq2.add(elem);
        int ans[] = new int[uniq2.size()];
        int i=0;
        for(int e : uniq2) ans[i++] = e;
        System.out.println(Arrays.toString(ans));

    }
}
