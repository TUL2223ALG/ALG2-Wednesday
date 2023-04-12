package week07_commandline;

import java.io.File;

public class CommandLine {

    private File actualDir;

    public CommandLine() {
        actualDir = new File(System.getProperty("user.dir"));
    }

    public String help(String command) {
        String output;

        switch (command) {
            case "dir":
                output = "vrátí víceřádkový textový řetězec s formátovaným výpisem aktuálního adresáře";
                break;
            case "cd":
                output = "změna aktuálního adresáře dle parametru (parametr může představovat\n"
                        + "absolutní nebo i relativní cestu)";
                break;
            case "mkfile":
                output = " vytvoří nový soubor, jehož jméno bylo zadáno v parametru";
                break;
            case "mkdir":
                output = "vytvoří zadaný adresář";
                break;
            case "mkdirs":
                output = "vytvoří adresáře odpovídající cestě zadané v parametru";
                break;
            case "rename":
                output = "přejmenuje soubor nebo adresář";
                break;
            default:
                output = "help ti pomáhá";
        }
        return output;

    }

    public String dir() {
        return dir(actualDir);
    }

    public String dir(String adresar) {
        File tempActualDir = new File(actualDir, adresar);
        return dir(tempActualDir);
    }
    
    //vrati podadresare a pak soubory v zadanem adresari bez skrytych souboru
    private String dir(File dir) {
        File[] sub = dir.listFiles();
        String adresare = "";
        String soubory = "";
        for (int i = 0; i < sub.length; i++) {
            if (sub[i].getName().charAt(0) != '.') { //neni skryty soubor
                if (sub[i].isDirectory()) {
                    adresare = adresare + sub[i].getName() + "\n"; //lepsi pres StringBuilder
                } else {
                    soubory = soubory + sub[i].getName() + "\n";
                }
            }
        }
        return adresare + soubory;
    }

    public String getActualDir() {
        return actualDir.getAbsolutePath();
    }

}
