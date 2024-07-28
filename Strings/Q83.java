package Strings;

public class Q83 {
    public static void main(String[] args) {
        String sentence = "or bhai ghumne chle kya railway station";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length-1; i++) {
            for (int j = 0; j < words.length-1-i; j++) {
                if(words[j].compareTo(words[j+1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        String ans = "";
        for(String word : words){
            if(word.length() > 0){
                ans = ans + word + " ";
            }
        }
        ans = ans.trim();
        System.out.println(ans);
    }
}
