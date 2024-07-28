package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) throws IOException {
        File fl = new File("D:\\ccdata\\new2.txt");
        System.out.println(fl.createNewFile());
        FileWriter fw  = new FileWriter(fl);
        fw.write("Hello2!");
        fw.close();
    }
}
