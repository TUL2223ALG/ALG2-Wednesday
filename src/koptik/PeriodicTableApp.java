package koptik;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PeriodicTableApp {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        String path = "D:\\New Folder\\JavaApplication2\\data\\prvky.csv";
        BufferedReader reader = new BufferedReader(new FileReader(path)); //JV try with resources
        String line = reader.readLine();
        while(line != null){
        line = reader.readLine();
        String parts [] = line.split(",");
        String name = parts[0];
        String symbol = parts[2];
        int proton = Integer.parseInt(parts[1]); 
        double relative = Double.parseDouble(parts[3]);
        Element lol = new Element(name,symbol,proton,relative);
        //ElementList.addElement(lol);
        }
    }

}