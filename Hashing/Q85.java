package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Q85 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,3,3,5,48,3,8,4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : arr){
            map.put(e,map.getOrDefault(e,0)+1);
//            if(map.containsKey(e)){
//                int old = map.get(e);
//                int newf = old+1;
//                map.put(e,newf);
//            }
//            else{
//                map.put(e,1);
//            }
        }
        System.out.println(map);
    }
}
