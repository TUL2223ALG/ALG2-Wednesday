package luca;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTools {

    public static ArrayList<Element> readFromElements(PeriodicTable periodicTable) {
        ArrayList<Element> elements = new ArrayList<>();
        try { //JV try with resources
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ul\\Documents\\NetBeansProjects\\ALG2PeriodicTableLuca\\data\\prvky.csv"));
            String description = br.readLine();
            String str;
            while ((str = br.readLine()) != null) {
                String[] strData = str.split(",");
                String name = strData[0];
                int protonNumber = Integer.parseInt(strData[1]);
                String symbol = strData[2];
                double relativeAtomWeight = Double.parseDouble(strData[3]);
                //dodelat - ulozit pouze jednou
                
                periodicTable.addElement(name, symbol, protonNumber, relativeAtomWeight);
            }
        } catch (IOException e) {
            System.out.println("Soubor nenalezen"); //JV nevypisovat mimo UI
        }
        return elements;
    }

    public static ArrayList<String> readFromYearsFounded() {
        Scanner scanner;
        ArrayList<String> yearsData = new ArrayList<>();
        try {
            scanner = new Scanner(new File("C:\\Users\\ul\\Documents\\NetBeansProjects\\ALG2PeriodicTableLuca\\data\\rokObjeveni.txt"));
            String description = scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                yearsData.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Soubor nenalezen");
        }
        return yearsData;
    }
    
    public static void saveElementToBinaryFile(String nameOfFile){
        try {
            FileOutputStream fileInputStream = new FileOutputStream(new File("C:\\Users\\ul\\Documents\\NetBeansProjects\\ALG2PeriodicTableLuca\\data"));
            DataOutputStream dataOutputStream = new DataOutputStream(fileInputStream);
            //JV chybi zapis
        } catch (FileNotFoundException ex) {
            System.out.println("Chyba");
        }
    }
    
}
