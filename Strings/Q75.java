package Strings;

public class Q75 {
    public static void main(String[] args) {
        String s = "orbhaikyahaalchaal";
        int c = 0, v = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> v++;
                default -> c++;
            }
        }
        System.out.println("Vowel = " + v);
        System.out.println("Consonant = " + c);


    }
}
