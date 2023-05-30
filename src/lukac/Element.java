package lukac;

import java.util.Comparator;

public class Element implements Weightable,Comparable<Element>{
    private String nazev;
    private String symbol;
    private int protCislo;
    private double relAtomHmotnost;
    private int rokObjeveni;
    
    public Element(String nazev, String symbol, int protCislo, double relAtomHmotnost){
        this.nazev = nazev;
        this.symbol = symbol;
        this.protCislo = protCislo;
        this.relAtomHmotnost = relAtomHmotnost;
    }
    public Element(String nazev, String symbol, int protCislo, double relAtomHmotnost, int rokObjeveni){
        this.nazev = nazev;
        this.symbol = symbol;
        this.protCislo = protCislo;
        this.relAtomHmotnost = relAtomHmotnost;
        this.rokObjeveni = rokObjeveni;
    }
    
    @Override
    public double getWeight(){
        return this.relAtomHmotnost;
    }
    
    public void setRokObjeveni(int rokObjeveni){
        //if (this.rokObjeveni)
        this.rokObjeveni = rokObjeveni;
    }
    
    @Override
    public String toString(){
        return this.nazev+", "+this.symbol+", "+this.protCislo+", "+this.relAtomHmotnost+", "+this.rokObjeveni;
    }    

    public String getNazev() {
        return nazev;
    }

    public int getProtCislo() {
        return protCislo;
    }

    public String getSymbol() {
        return symbol;
    }
    //JV zbytocny Comparator aj Comparable na rovnaky atribut
    public static Comparator DLE_PROT_CISLA = new Comparator<Element>(){
            @Override
            public int compare(Element e1, Element e2){
                return e1.getProtCislo() - e2.getProtCislo();
            }
    };
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.protCislo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final lukac.Element other = (lukac.Element) obj;
        return this.protCislo == other.protCislo;
    }
    @Override
    public int compareTo(Element o) {
        return this.getProtCislo() - o.getProtCislo();
    }
    
    //JV chybi parsovani
}
