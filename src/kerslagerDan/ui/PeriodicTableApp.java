/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kerslagerDan.ui;
import java.util.ArrayList;
import kerslagerDan.data.IO;
import kerslagerDan.objects.*;
/**
 *
 * @author ul
 */
public class PeriodicTableApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeriodicTable table = new PeriodicTable();
        String prvky= readFile("data/prvky.csv");
        String[] parsePrvky = prvky.split("\n");
        for(int i=0;i<parsePrvky.length;i++){
            table.addElement(parsePrvky[i]);
        }
        String rok = readFile("data/rokObeveni.txt");
        String[] parserok = rok.split("\n");
        for(int i=0;i<parserok.length;i++){
            table.addDiscovery(parsePrvky[i]);
        }
        ArrayList<Element> sortTable = table.sortTableMass();
        System.out.println("deset nejtěžších prvků jsou:");
        for (int i = 0; i<10;i++){
            System.out.println(sortTable.get(i).toString());
        }
        Element oldest = table.getOldest();
        System.out.println("Nejstarší prvek je:");
        System.out.println(oldest.toString());
        int age = 2023-oldest.getDiscovery();
        System.out.println("Byl objeven před "+age+" lety.");
        
        //JV kde je readFile?
    }
}