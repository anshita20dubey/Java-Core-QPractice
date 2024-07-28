package Hashing;

import java.util.HashSet;
import java.util.Set;

public class Q86 {
    public int numJewelsInStones(String jewels, String stones) {
        int ans =  0;
        Set<Character> set = new HashSet<>(jewels.length());
        for(char ch : jewels.toCharArray()) set.add(ch);
        for(char ch : stones.toCharArray()){
            if(set.contains(ch)) ans++;
        }
        return ans;
    }

}
