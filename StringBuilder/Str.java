package StringBuilder;

public class Str {
    public static void main(String[] args) {
        String s = "labrador";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("abcd");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // before 8 24
        // after 12 24
        s = sb.toString();
        s = new StringBuilder(s).reverse().toString();
        System.out.println(s);
    }
}
