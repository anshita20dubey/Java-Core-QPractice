package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        var arr = new ArrayList<Integer>();
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(10);
        arr.add(2);
        System.out.println(arr);

        arr.remove(2);
        arr.remove(Integer.valueOf(10));
        System.out.println(arr);

        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

        for (int data : list) {
            System.out.println(data + " ");
        }

        list.forEach(data -> {
            System.out.println(data + " ");
        });

        list.forEach(System.out::println);

    }
}
