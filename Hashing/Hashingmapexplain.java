package Hashing;
import java.util.*;

public class Hashingmapexplain {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,2,3,7,4,8,9,6,7};
        Map<Integer, Integer> map = new HashMap<>();
        //entry set
        for(int e: arr){
            map.put(e, map.getOrDefault(e, 0)+1);

        }
        System.out.println(map);
    }
}

class Prac{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

//
//        for(int i : list){
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        list.add(3, 100);
        list.addFirst(1);
        list.addLast(109);
        list.remove(2);
        list.set(0,12222);
        System.out.println(list);


//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Arpita");
//        map.put(2, "Anshita");
//        map.put(3, "Ansh");
//        map.put(5, "Anshika");
//       iterate over entryset
//        for(Map.Entry<Integer, String> e : map.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey() + " -> " +  e.getValue());
//        }
        // iterate over key
//        for(int e : map.keySet()){
//            System.out.println(e);
//        }


//        System.out.println(map);
//
//        int[] arr = {1,2,5,6,2,3,7,4,8,9,6,7};
//        HashSet<Integer> set = new HashSet<>();
//
//        for(int a :arr){
//            set.add(a);
//        }

//        Iterator it = set.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
