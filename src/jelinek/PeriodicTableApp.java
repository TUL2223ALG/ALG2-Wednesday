/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jelinek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ul
 */
public class PeriodicTableApp {
    String FILECSV=/*"data"+System.getProperty("file_separator")+*/"data/prvky.csv";
    Element element;
    Tools t = new Tools();
    
    public PeriodicTable readCSV(PeriodicTable table){
        try{
            //System.out.println("Vypisuju ze souboru: ");
           
            File file = new File(FILECSV);
            BufferedReader br = new BufferedReader(new FileReader(file)); //JV pouzivat try with resources
            br.readLine();
            while(br.readLine()!=null) { //JV radek prectete, ale nikam si neulozite
                String[] pole = new String[5]; //
                pole = t.getInput(br.readLine());
                //System.out.println("pole: "+pole[0]);
                //System.out.println("pole: "+pole[3]);
                element = t.createElement(pole, element,2); //JV zmatene
                if (element!=null) {
                    table.fillList(element);
                }
            }
            return table;
        }catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }
    
}
