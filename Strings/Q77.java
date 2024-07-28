package Strings;

public class Q77 {
    public static boolean isPre(String word, String pref) {
        if (word.length() < pref.length()) return false;
        for (int i = 0; i < pref.length(); i++) {
            if (word.charAt(i) != pref.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend", "atlas"};
        String pref = "at";
        int count = 0;
        for (String word : words) {
            boolean ans = isPre(word, pref);
            if (ans) {
                count++;
            }
        }
        System.out.println(count);
    }
}
//        int ans = 0;
//        for(String word : words){
//            if(word.startsWith(pref)) ans++;
//        }
//        System.out.println(ans);
