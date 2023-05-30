package koptikv2;
import java.util.ArrayList;
import java.util.List;

public class PeriodicTable {
    private List<Element> elements;

    public PeriodicTable() {
        elements = new ArrayList<>();
    }

    public void addElement(String name, String symbol, int protonNumber, double relativeWeight) {
        Element element = new Element(name, symbol, protonNumber, relativeWeight);
        elements.add(element);
    }

    public List<Element> getElements() {
        return elements;
    }
    
    public void setElementYearDiscovered(String symbol, Integer yearDiscovered) {
        for (Element element : elements) {
            if (element.getSymbol().equals(symbol)) {
                element.setYearDiscovered(yearDiscovered);
                break;
            }
        }
    }
}

