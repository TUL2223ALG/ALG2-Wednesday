package koptikv2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PeriodicTableApp {

    public static void main(String[] args) {
        String userHome = System.getProperty("user.home");
        String filePath = userHome + "\\Desktop\\prvky.csv";
        String yearDiscoveredFilePath = userHome + "\\Desktop\\rokObjeveni.txt";

        PeriodicTable periodicTable = new PeriodicTable();

        try ( BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Přeskočit první řádek s hlavičkou
            Set<String> addedElements = new HashSet<>();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                String name = values[0];
                int protonNumber = Integer.parseInt(values[1]);
                String symbol = values[2];
                double relativeWeight = Double.parseDouble(values[3]);

                if (!addedElements.contains(symbol)) {
                    periodicTable.addElement(name, symbol, protonNumber, relativeWeight);
                    addedElements.add(symbol);
                }
            }
        } catch (IOException e) {
            System.err.println("Chyba při čtení souboru: " + e.getMessage());
        }

        try ( Scanner scanner = new Scanner(new File(yearDiscoveredFilePath))) {
            scanner.nextLine(); // Přeskočit první řádek s hlavičkou

            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().trim().split("\\s+");

                if (values.length < 4) {
                    continue;
                }

                String symbol = values[2];
                String yearStr = values[3];

                Integer year = yearStr.equals("N") ? null : Integer.parseInt(yearStr);
                periodicTable.setElementYearDiscovered(symbol, year);
            }
        } catch (IOException e) {
            System.err.println("Chyba při čtení souboru: " + e.getMessage());
        }

        for (Element element : periodicTable.getElements()) {
            System.out.println(element);
        }
        List<Element> sortedElements = new ArrayList<>(periodicTable.getElements());
        sortedElements.sort((e1, e2) -> Double.compare(e2.getWeight(), e1.getWeight()));

        System.out.println("10 prvků s nejvyšší relativní hmotností:");
        for (int i = 0; i < 10 && i < sortedElements.size(); i++) {
            Element element = sortedElements.get(i);
            System.out.println((i + 1) + ". " + element);
        }

        // Find the oldest element
        int currentYear = java.time.Year.now().getValue();
        Element oldestElement = null;
        int minYearsAgo = Integer.MAX_VALUE;

        for (Element element : periodicTable.getElements()) {
            Integer yearDiscovered = element.getYearDiscovered();

            if (yearDiscovered != null) {
                int yearsAgo = currentYear - yearDiscovered;

                if (yearsAgo < minYearsAgo) {
                    minYearsAgo = yearsAgo;
                    oldestElement = element;
                }
            }
        }
        if (oldestElement != null) {
            System.out.println("Nejstarší prvek: " + oldestElement);
            System.out.println("Byl objeven před " + minYearsAgo + " lety.");
        } else {
            System.out.println("Nenalezen žádný prvek s datem objevení.");
        }

    }
}
