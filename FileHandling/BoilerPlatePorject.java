package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BoilerPlatePorject {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String projectName = sc.nextLine();
        String pathName = "D:\\ccdata\\";
        File folder = new File(pathName+projectName);
        folder.mkdir();

        // karyakaram for HTML
        File flHTML = new File(pathName+projectName+"\\index.html");
        flHTML.createNewFile();
        FileWriter fwHTML = new FileWriter(flHTML);
        fwHTML.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>Document</title>\n" +
                "  <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "  \n" +
                "  <script src=\"script.js\"></script>\n" +
                "</body>\n" +
                "</html>");
        fwHTML.close();

        // karyakaram for CSS
        File flCSS = new File(pathName+projectName+"\\style.css");
        flCSS.createNewFile();
        FileWriter fwCSS = new FileWriter(flCSS);
        fwCSS.write("*\n" +
                "{\n" +
                " margin: 0;\n" +
                " padding: 0;\n" +
                " box-sizing: border-box;\n" +
                " font-family: gilroy;\n" +
                "}\n" +
                "\n" +
                "html,body\n" +
                "{\n" +
                " width: 100%;\n" +
                " height: 100%\n" +
                "}");
        fwCSS.close();

        // karyakaram for JS
        File flJS = new File(pathName+projectName+"\\style.css");
        flJS.createNewFile();

    }
}
