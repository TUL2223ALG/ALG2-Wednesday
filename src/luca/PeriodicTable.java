package luca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PeriodicTable {

    private ArrayList<Element> listOfElements = new ArrayList<>();

    public void addElement(String name, String symbol, int protonNumber, double relativeAtomWeight) {
        Element element = new Element(name, symbol, protonNumber, relativeAtomWeight);
        listOfElements.add(element);
    }

    //JV rozdelit do vice metod - naparsovani na jednotlive int, vyhledani prvku s danym symbolem, nastaveni roku
    public void setYears(ArrayList<String> yearsData) {
        for (int i = 0; i < yearsData.size(); i++) {
            String[] strData = yearsData.get(i).split("\\s+");
            String symbol = strData[2];
            String yearFoundedStr = strData[3];
            int yearFounded = -1;
            if (!yearFoundedStr.equals("N")) {
                yearFounded = Integer.parseInt(yearFoundedStr);
            }
            for (int j = 0; j < listOfElements.size(); j++) {
                if (listOfElements.get(j).getSymbol().equals(symbol)) {
                    listOfElements.get(j).setYearFounded(yearFounded);
                    break;
                }
            }
        }

    }

    public String getFirstTen() {
        Collections.sort(listOfElements);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(listOfElements.get(i).getName()).append(", Atomova hmotnost: ").append(listOfElements.get(i).getRelativeAtomWeight()).append("\n");
        }
        return stringBuilder.toString();
    }

    public Element getTheOldestElement() {
        Collections.sort(listOfElements, new Comparator<Element>() {
            @Override
            public int compare(Element e1, Element e2) {
                if (e1.getYearFounded() > e2.getYearFounded()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        Element element = listOfElements.get(listOfElements.size() - 1);
        for (int i = listOfElements.size() - 1; i >= 0; i--) {
            if (listOfElements.get(i).getYearFounded() != -1) {
                element = listOfElements.get(i);
            }
        }
        return element;
    }

    public double getRelativeWeightOfElement(String symbolOfElement) {
        return getElementBySymbol(symbolOfElement).getWeight();
    }

    public double getRelativeWeightOfElement(String nameOfElement, int count) {
        MoleculeSame moleculeSame = new MoleculeSame();
        Element element = getElementBySymbol(nameOfElement);
        moleculeSame.saveMolecule(element, count);
        return moleculeSame.getWeight();
    }

    private Element getElementBySymbol(String nameOfElement) {
        for (int i = 0; i < listOfElements.size(); i++) {
            if (nameOfElement.equals(listOfElements.get(i).getSymbol())) {
                return listOfElements.get(i);
            }
        }
        return null;
    }

    //for testing
    public ArrayList<Element> getListOfElements() {
        return listOfElements;
    }

}
