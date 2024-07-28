package Strings;

import java.util.Scanner;

public class Q79 {
    public static String cap(String word){
        char[] arr = word.toCharArray();
        int n = arr.length;
        arr[0] = Character.toUpperCase(arr[0]);
        arr[n-1] = Character.toUpperCase(arr[n-1]);

        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = new String();
        String[] words = s.split(" ");
        for (String word : words) {
            if(word.length() > 0){
                word = cap(word);
                res = res + word + " ";
            }
        }
        res = res.trim();
        System.out.println(res);
    }
}
