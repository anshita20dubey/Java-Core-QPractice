package ExceptionHandling;

public class Trycatchfinal {
    public static void main(String[] args) {
        System.out.println("Hello world");
        try {
            System.out.println(1 / 0);
        } catch (Exception obj) {
            System.out.println(obj);
        } finally {
            System.out.println("Mai to chlunga...");
        }
        System.out.println("Hello world");
    }
}
