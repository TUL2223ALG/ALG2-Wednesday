package week07_commandline;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir") + ">");
        String filepath = System.getProperty("user.dir");
        File actualDir = new File(filepath);
        String command = "dir";
        if (command.equals("dir")){
            String[] sub = actualDir.list();
            System.out.println(Arrays.toString(sub));
        }
        actualDir = new File(actualDir, "Documents");
        System.out.println(actualDir.getAbsolutePath());
        //System.out.println(System.getProperty("file.separator"));
    }
    
}
