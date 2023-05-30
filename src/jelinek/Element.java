/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jelinek;

/**
 *
 * @author ul
 */
//  Nazev,  Cislo,      Symbol, Hmotnost,   Var  ,Tani,      Hustota,               Tajemstvi,
//Hydrogen,     1        ,H      ,1.01,  20.46   ,13.96      ,71,        0.45       ,0.06,
public class Element {

    private String name;
    private int pNum;
    private String symbol;
    private double gMol;
    private int year;

    //Without Year
    public Element(String name, int pNum, String symbol, double gMol) {
        this.name = name;
        this.pNum = pNum;
        this.symbol = symbol;
        this.gMol = gMol;
    }

    //With Year
    public Element(String name, int pNum, String symbol, double gMol, int year) {
        this.name = name;
        this.pNum = pNum;
        this.symbol = symbol;
        this.gMol = gMol;
        this.year = year;
    }

    public String toString() {
        return name + ", " + symbol + ", " + pNum + ", " + gMol + ", " + year;
    }

    public boolean hasYear() {
        if (year == 0) {
            return false;
        }
        return true;
    }

    public double getgMol() {
        return gMol;
    }

    public int getpNum() {
        return pNum;
    }

    public String getSymbol() {
        return symbol;
    }
    

    public void setYear(int year) { //JV nastavit rok, jen pokud nebyl nastaveny
        this.year = year;
    }
    
    
    //JV chybi parsování

}
