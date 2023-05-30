/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jelinek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ul
 */
//Prvni,Druhy,Treti,Ctvrty
public class Ui {

    Tools t = new Tools();
    Scanner sc = new Scanner(System.in);
    Element element;
    MoleculeSam molSum;
    Sloucenina slouc;
    
    PeriodicTable table = new PeriodicTable();
    ArrayList<Element> list;

    PeriodicTableApp app = new PeriodicTableApp();
    
    public void start() {
        String[] templates = {"Vodik,H,1,1.01", "Kyslik,O,8,16.00", "Chlor,Cl,17,35.45"};
        for (int i = 0; i < 3; i++) {
            String[] pole = new String[5];
            pole = t.getInput(templates[i]);
            element = t.createElement(pole, element,1);
            if (!element.equals(null)) {
                table.fillList(element);
                /*System.out.println("Element: " + t.outElement(element));
            System.out.println("Kolik do Sloučeniny? ");
            int num = sc.nextInt();
            molSum = t.createSum(element, molSum, num);
            System.out.println("Váha sum of "+num+": "+molSum.getWeight(element));
                 */
            }
        }
        list = (table.printList());
        printList(list);
        
        System.out.println("Nastav datum 1774 u Cl");
        table.setDate(list, "Cl", 1774);
        printList(list);
        System.out.println("Vytvořme sloučeninu H2");
        slouc = new Sloucenina(list.get(0),2);
        molSum=new MoleculeSam(slouc.getNum(),slouc.getElement());
        System.out.println("g/mol sum: "+molSum.getWeight());
        System.out.println("Vytvořme sloučeninu O3");
        slouc = new Sloucenina(list.get(1),3);
        molSum=new MoleculeSam(slouc.getNum(),slouc.getElement());
        System.out.println("g/mol sum: "+molSum.getWeight());
        
        
        //pole = t.getInput(sc.nextLine());
        System.out.println("Načítám ze souboru: ");
        table=app.readCSV(table);
        list=table.printList();
        printList(list);
    }
    
    public void printList(ArrayList<Element> list) {
        System.out.println("Vypisuji list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void outArray(String[] pole) {
        for (String a : pole) {
            System.out.println(a);
        }
    }
}
