package StringBuilder;

public class Empty {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("abcd");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
//         before 0 16
//         after 4 16
        sb.reverse();
        System.out.println(sb);



    }
}
