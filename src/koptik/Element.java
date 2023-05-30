package koptik;

public class Element {
    private String name;
    private String symbol;
    private double protonNumber;
    private int pocet;

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setProtonNumber(double protonNumber) {
        this.protonNumber = protonNumber;
    }

    public void setPocet(int pocet) {
        this.pocet = pocet;
    }

    public void setRelative(double relative) {
        this.relative = relative;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getProtonNumber() {
        return protonNumber;
    }

    public double getRelative() {
        return relative;
    }

    public String getYear() {
        return year;
    }
    private double relative;
    private String year;

    public Element(String name, String symbol, double protonNumber, double relative) {
        this.name = name;
        this.symbol = symbol;
        this.protonNumber = protonNumber;
        this.relative = relative;
        this.year = "Unkown";
        this.pocet = 1;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getWeight() {
        double Weightable = this.relative;
        return Weightable;
    }

    public String getInfo() {
        String name = this.name;
        String symbol = this.symbol;
        double proton = this.protonNumber;
        double relative = this.relative;
        String year = this.year;
        String info = name + "," + symbol + "," + proton + "," + relative + "," + year;
        return info;
    }
}
