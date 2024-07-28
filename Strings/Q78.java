package Strings;

public class Q78 {
    public static String cap(String s){
        char arr[] = s.toCharArray();
        if(arr[0] >= 'a' && arr[0] <= 'z')
            arr[0] = (char) (arr[0] - 32);
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "or bhai kya haal chaal";
        String words[] = s.split(" ");
        for (String word : words) {
            System.out.println(cap(word));
        }
    }
}