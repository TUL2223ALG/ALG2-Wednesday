/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palfi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ul
 */
public class PeriodicTable {

    List<Element> elements;

    public PeriodicTable() {
        elements = new ArrayList<>();
    }

    public void add(String fullName, String symbol, int protonNumber, double atomWeight) {
        Element element = new Element(fullName, symbol, protonNumber, atomWeight);
        elements.add(element);
    }

    public Element getElement(int index) {
        return elements.get(index);
    }

    public Element getOldestElement() { //JV dokoncit
        int oldestYear = 0;
        return null;
    }

    public void printElements() {
        for (Element element : elements) {
            System.out.println(element);
        }
    }

    public void loadYears() throws IOException {
        System.out.println("-----------");
        String separator = System.getProperty("file.separator");
        String rok = "data" + separator + "rokObjeveni.txt";
        File yearsFile = new File(rok);
        try ( BufferedReader br = new BufferedReader(new FileReader(yearsFile))) { //JV mel se pouzit Scanner
            String[] lines;
            String line;
            int foundYear;
            String symbol;
            br.readLine();
            int number = 0;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }

                lines = line.split(" ");
                System.out.println(line);
                symbol = lines[2];
                System.out.println(lines[3]);
                if (lines[3].contains("N")) {
                    foundYear = -1;
                } else {
                    foundYear = Integer.parseInt(lines[3]);
                }
                for (Element element : elements) {
                    if (element.getSymbol().equals(symbol)) {
                        element.setfoundYear(foundYear);
                    }
                }
            }

        }
    }

    public void loadElements() throws IOException {
        String separator = System.getProperty("file.separator");
        String prvkyData = "data" + separator + "prvky.csv";

        File elementFile = new File(prvkyData);

        try ( BufferedReader br = new BufferedReader(new FileReader(elementFile))) {
            String[] lines;
            String fullname, symbol;
            int protonNumber;
            double atomWeight;
            String line;
            int number = 0;
            br.readLine();
            List<String> listElimination = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }

                lines = line.split(",");
                fullname = lines[0];

                if (!listElimination.contains(fullname)) {
                    number += 1;
                    listElimination.add(fullname);
                } else {
                    continue;
                }
                symbol = lines[2];
                protonNumber = Integer.parseInt(lines[1]);
                atomWeight = Double.parseDouble(lines[3]);
                System.out.println(symbol);

                add(fullname, symbol, protonNumber, atomWeight);

            }
            System.out.println(number + " krát");
        }
    }
}
