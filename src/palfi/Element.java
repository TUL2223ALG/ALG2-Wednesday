/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palfi;

/**
 *
 * @author ul
 */
public class Element implements Weightable, Comparable<Element> {

    private String name;
    private String symbol;
    private int protonNumber;
    private double rellativeAtomWeight;
    private int foundYear;

    public Element(String name, String symbol, int protonNumber, double rellativeAtomWeight) {
        this.name = name;
        this.symbol = symbol;
        this.protonNumber = protonNumber;
        this.rellativeAtomWeight = rellativeAtomWeight;
    }

    public void setfoundYear(int year) { //JV jen pokud nebyl zadany
        this.foundYear = year;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getFoundYear() {
        return foundYear;
    }

    @Override
    public double getWeight() {
        return rellativeAtomWeight;
    }

    @Override
    public String toString() {
        return String.format(name + " " + symbol + " " + protonNumber + " "
                + rellativeAtomWeight + " " + foundYear);
    }

    @Override
    public int compareTo(Element o) {
        return this.protonNumber - o.protonNumber;
    }
    
    //JV chybi parsovani
}
