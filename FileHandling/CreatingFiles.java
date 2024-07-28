package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFiles {
    public static void main(String[] args) throws IOException {
        File fl = new File("D:\\ccdata\\new.txt");
        System.out.println(fl.createNewFile());
        FileWriter fw  = new FileWriter(fl);
        fw.write("Hello! snvnjebrvjv bawn uvhev");
        fw.close();

//        System.out.println(fl.mkdir());
//        System.out.println(fl.delete());
//        System.out.println(fl.isDirectory());
//        System.out.println( fl.exists());
//        System.out.println(fl.getName());
//        System.out.println(fl.getAbsolutePath());
    }
}
