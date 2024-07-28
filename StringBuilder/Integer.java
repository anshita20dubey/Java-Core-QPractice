package StringBuilder;

public class Integer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1000);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("abcd");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // before 0 1000
        // after 4 1000

    }
}
