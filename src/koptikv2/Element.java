package koptikv2;
public class Element implements Weightable {
    private String name;
    private String symbol;
    private int protonNumber;
    private double relativeWeight;
    private Integer yearDiscovered;

    public Element(String name, String symbol, int protonNumber, double relativeWeight) {
        this.name = name;
        this.symbol = symbol;
        this.protonNumber = protonNumber;
        this.relativeWeight = relativeWeight;
        this.yearDiscovered = null;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getProtonNumber() {
        return protonNumber;
    }

    public double getRelativeWeight() {
        return relativeWeight;
    }

    public Integer getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(Integer yearDiscovered) {
        if (this.yearDiscovered == null) {
            this.yearDiscovered = yearDiscovered;
        }
    }
    
    @Override
    public double getWeight() {
        return relativeWeight;
    }

    @Override
    public String toString() {
        String yearDiscoveredString = (yearDiscovered == null) ? "neznámý" : yearDiscovered.toString();
        return name + ", " + symbol + ", " + protonNumber + ", " + relativeWeight + ", " + yearDiscoveredString;
    }
}
