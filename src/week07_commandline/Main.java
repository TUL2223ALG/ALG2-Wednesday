/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week07_commandline;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author jana.vitvarova
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir") + ">");
        File actualDir = null;
        String command = "dir";
        if (command.equals("dir")){
            String filepath = System.getProperty("user.dir");
            actualDir = new File(filepath);
            String[] sub = actualDir.list();
            System.out.println(Arrays.toString(sub));
        }
        actualDir = new File(actualDir, "Documents");
        System.out.println(actualDir.getAbsolutePath());
        //System.out.println(System.getProperty("file.separator"));
    }
    
}
