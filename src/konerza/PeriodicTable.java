/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konerza;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ul
 */
public class PeriodicTable {
    ArrayList<Element> periodickaTabulka = new ArrayList();
    
    public PeriodicTable(){
    }
    
    public void addToPeriodicTable(String nazev, String symbol, int protonoveCislo, double relativniAtomHmotnost){
        Element prvek = new Element(nazev, symbol, protonoveCislo, relativniAtomHmotnost);
        periodickaTabulka.add(prvek);
    }
    
    
    public boolean isDuplicite(int protonoveCislo){
        for (int i = 0; i < periodickaTabulka.size(); i++) { //JV jednodussi prochazet pres for each
            Element bruh =  periodickaTabulka.get(i);
            int protonoveCisloPrvku = bruh.getProtonoveCislo();
            if(protonoveCisloPrvku == protonoveCislo){
               return true; 
            }
        }
        
        return false;
    }
    
    public void setElementDate(String symbol,int datumObjeveni){
        for (Element prvek : periodickaTabulka) {
            String symbolPrvku = prvek.getSymbol();
            if(symbolPrvku.equals(symbol)){
                prvek.setDatumObjeveni(datumObjeveni);
            }
        }
    }
    
    public void sortElementsByWeight(){
        Collections.sort(periodickaTabulka,new AtomovaHmotnostCompare());
    }
    
    public void printTopTenElements(){
        for (int i = 0; i < 10; i++) {
            Element prvek = periodickaTabulka.get(i);
            System.out.println(prvek.toString()); //JV mimo UI vracet String
        }
    }
    
    public void sortElementsByDate(){
        Collections.sort(periodickaTabulka,new dateCompare());
    }
    
    public void printTopElement(){
        System.out.println(periodickaTabulka.get(0));
    }
    
}
