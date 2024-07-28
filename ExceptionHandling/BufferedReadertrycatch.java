package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadertrycatch {
    public static void main(String[] args) {
//        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(e.toString()); // string me kr dega
            System.out.println(e.getCause()); //isme kya mila h vo print hoga
            e.printStackTrace(); //isme line pta pdegi
        }
        System.out.println("hello world");
    }
}
