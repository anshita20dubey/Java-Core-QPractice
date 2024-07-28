package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        File fl = new File("D:\\ccdata\\new.txt");
        System.out.println(fl.createNewFile());

//        Scanner sc = new Scanner(fl);
//        while (sc.hasNext()){ -> jb tk data h tb tk chlte chlo
//            String data = sc.nextLine();
//            System.out.print(data+" ");
//        }

        FileReader fr = new FileReader(fl);
        int i;
        while ((i = fr.read()) != -1){ // -> jb tk ascii value valid return ho rhi h chlo jese hi -1 hogi condition false ho jyegi or bnd ho jyega
            System.out.print((char) i);
        }
    }
}
