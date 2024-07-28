package Strings;

public class Q73 {
    public static void main(String[] args) {
        String str = "lol";
        String res = "";
        for (int i = str.length() - 1; i > -1; i--) {
            res += str.charAt(i);
        }
        System.out.println(str.equals(res) ? "Pallindrome" : "Not pallindorme");

    }
}
// string builder
//        StringBuilder sb = new StringBuilder();
//        for (int i = s.length() - 1; i >= 0; i--) {
//        sb.append(s.charAt(i));
//        }
//        System.out.println(s.equals(sb.toString()) ? "Pallindrome" : "Not pallindrome");