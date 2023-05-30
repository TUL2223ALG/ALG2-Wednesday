/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moc.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ul
 */
public class PeriodicTableApp implements Comparable<Element>{
    
    private File prvkyFile;
    private File rokFile;
    private ArrayList<Element> elements; //JV toto by mela obsahovat PeriodicTable
    private static BufferedReader br;
    
    public PeriodicTableApp() {
        this.elements = new ArrayList<Element>();
    }
    
    public void loadFromFile() throws FileNotFoundException, IOException{
        prvkyFile = new File("D:\\ALG2PeriodicTableMoc\\data\\prvky.csv");
        br = new BufferedReader(new FileReader(prvkyFile)); //try with resources
        br.readLine();
        Element temp = Element.loadFromFile(br);
        do{
            this.addElement(temp);
            temp = Element.loadFromFile(br);
        }while(temp!=null);
    }
    
    public void loadTimeFromFile() throws FileNotFoundException, IOException{
        rokFile = new File("D:\\ALG2PeriodicTableMoc\\data\\rokObjeveni.txt");
        Scanner sc = new Scanner(new FileReader(rokFile));
        sc.nextLine();
        sc.next();
        sc.next();
        String symbol = sc.next();
        Element temp = findSameNames(symbol);
        do{
            temp.setYearFromFile(sc);
            sc.nextLine(); sc.next(); sc.next();
            symbol = sc.next();
            temp = findSameNames(symbol);
        }while(temp!=null);
        for(Element element : elements){          
            if(element.getYear()==0){
                element.setYearWithoutFile();
            }               
        }
    }
    
    public Element findSameNames(String symbol){
        for(Element element : elements){
            if(element.getSymbol().equals(symbol)){
                return element;
            }
        }
        return null;
    }
    
    public String displayElements(){
        StringBuilder sb = new StringBuilder();
        for(Element element : elements){
            sb.append(element);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public void addElement(Element element){
        elements.add(element);
    }

    public String sortArray(){
        //elements.sort()
        return "";
    }
    
    public String displayOldest(){
        String name = "";
        int max = Integer.MAX_VALUE;
        for(Element element : elements){
            if (element.getYear()<max) {
                name = element.getName();
                max = element.getYear();
            }
        }
        return String.format("Nejstarší prvek je: %s a byl objeven před %d roky", name, (2023-max));
    }
    
    @Override
    public int compareTo(Element o) {
        return 5;
    }
}
