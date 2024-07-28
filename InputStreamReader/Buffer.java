package InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String data = br.readLine();
        System.out.println(data);

        Integer data2 = Integer.parseInt(br.readLine());
        System.out.println(data2);

        double d = Double.parseDouble(br.readLine());
        System.out.println(d);

        int a = Integer.parseInt(br.readLine());
        System.out.println(a);

        int b = Integer.valueOf(br.readLine());
        System.out.println(b);

        char ch = br.readLine().charAt(0);
    }
}
