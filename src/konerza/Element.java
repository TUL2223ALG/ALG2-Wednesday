/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konerza;

/**
 *
 * @author ul
 */
public class Element implements Weightable {
    
    private String nazev;
    private String symbol;
    private int protonoveCislo;
    private double relativniAtomHmotnost;
    private int datumObjeveni;
    
    
    public Element(String nazev, String symbol, int protonoveCislo, double relativniAtomHmotnost, int datumObjeveni){
        this.nazev = nazev;
        this.symbol = symbol;
        this.protonoveCislo = protonoveCislo;
        this.relativniAtomHmotnost = relativniAtomHmotnost;
        this.datumObjeveni = datumObjeveni;
    }
    
    public Element(String nazev, String symbol, int protonoveCislo, double relativniAtomHmotnost){
        this.nazev = nazev;
        this.symbol = symbol;
        this.protonoveCislo = protonoveCislo;
        this.relativniAtomHmotnost = relativniAtomHmotnost;
    }

    @Override
    public double getWeight() {
        return this.relativniAtomHmotnost;
    }
    @Override
    public String toString() {
        return (this.nazev + "," + this.symbol + "," +  this.protonoveCislo + "," +  this.relativniAtomHmotnost + "," + this.datumObjeveni);
    }
    
    public int getProtonoveCislo(){
        return this.protonoveCislo;
    }
    
    public String getSymbol(){
        return this.symbol;
    }
    
    public void setDatumObjeveni(int datumObjeveni){ //JV nastavit, jen pokud jeste nebyl nasteveny
        this.datumObjeveni = datumObjeveni;
    }
    
    public int getDate(){
        return this.datumObjeveni;
    }
    
    //JV chybi parsovani
}
