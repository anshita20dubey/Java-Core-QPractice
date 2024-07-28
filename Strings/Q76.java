package Strings;

public class Q76 {
    public static void main(String[] args) {
        String s = "AcgDfD";
        String res = "";
        for (char ch : s.toCharArray()) {
            res = res + (ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : (char) (ch + 32));
        }
        System.out.println(res);
    }
}

// using stringbuilder
//        StringBuilder sb = new StringBuilder();
//        for (char ch : s.toCharArray()) {
//          sb.append(ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : (char) (ch + 32));
//        }
//        System.out.println(sb.toString());