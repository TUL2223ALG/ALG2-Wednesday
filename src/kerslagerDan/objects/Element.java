/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kerslagerDan.objects;

import kerslagerDan.interfaces.Weightable;
import java.util.List;
import java.util.Comparator;
/**
 *
 * @author ul
 */
public class Element {
    private String nazev;
    private int cislo;
    private String symbol;
    private double hmotnost;
    private int obeveni;
    private Boolean hasObeveni;
    
    public Element(String nazev, int cislo, String symbol, double hmotnost){
        this.nazev = nazev;
        this.cislo = cislo;
        this.symbol = symbol;
        this.hmotnost = hmotnost;
        this.hasObeveni=false;
    }
    public Element(String vals){
        String[] str = nazev.split(",");
        int cislo = toInt(str[1]);
        double hmotnost = toDouble(str[3]);
        setElement(str[0],cislo,str[2],hmotnost);
    }
    private void setElement(String nazev, int cislo, String symbol, double hmotnost){
        this.nazev = nazev;
        this.cislo = cislo;
        this.symbol = symbol;
        this.hmotnost = hmotnost;
        this.hasObeveni=false;
    }
    public void setDiscovery(int rok){
        if (!hasObeveni){
            hasObeveni=true;
            this.obeveni=rok;
        }
    }
    public double getWeight(){//Implements Weightable. not sure about syntax
        return hmotnost;
    }
    public int getDiscovery(){
        return obeveni;
    }
    public String getSymbol(){
        return symbol;
    }
    public boolean isCalled(String nazev){
        return this.nazev.equals(nazev);
    }
    @Override
    public String toString(){
      return (nazev+","+symbol+","+cislo+","+hmotnost+","+obeveni); 
    }
    //JV podivat se na povnavani a trideni
    @Override
    public Boolean compare(Element element1, Element element2)implements Comparator;{
        if (element1.getWeight()>element2.getWeight()){
            return true;
        }
        return false;
    }
}
