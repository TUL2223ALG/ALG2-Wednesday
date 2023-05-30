/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kerslagerDan.objects;
import java.util.ArrayList;
/**
 *
 * @author ul
 */
public class PeriodicTable {
    ArrayList<Element> table;
    public PeriodicTable(){  //JV vytvorit objekt table
    }
    public void addElement(String vals){
        Boolean exists = false;
        String[] parceVals=vals.split(",");
        for (int i = 0;i<table.size();i++){
                if (table.get(i).isCalled(parceVals[2])){
                    exists=true;
                }
            }
        if (!exists){
            Element element = new Element(vals);
            table.add(element);
        }
    }
    //JV lepsi metoda s argumentem int a dalsi metoda, ktera to naparsuje
    public void addDiscovery(String vals){
        String[] parceVals = vals.split(" ");
        String symbol = parceVals[3];
        int rok;
        try{
            rok = toInt(parceVals[4]);
            for (int i = 0;i<table.size();i++){
                if (table.get(i).isCalled(symbol)){
                    table.get(i).setDiscovery(rok);
                }
            }
        }catch();
    }
    public Element findElement(String symbol){
        for(int i = 0; i<table.size();i++){
            if (table.get(i).getSymbol().equals(symbol)){
                return table.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Element> sortTableMass(){
        ArrayList<Element> sortTable =table;
        table.sort();
    }
    public Element getOldest(){
        int minDiscovery=10000;
        for (int i = 0;i<table.size();i++){
            if ((table.get(i).getDiscovery())<minDiscovery)){
                minDiscovery=(table.get(i).getDiscovery());
            }
        }
    }
}
