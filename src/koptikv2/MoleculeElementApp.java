package koptikv2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import koptikv2.Element;
import koptikv2.MoleculeSame;
import koptikv2.PeriodicTable;

public class MoleculeElementApp {
    public static void main(String[] args) {
        PeriodicTable periodicTable = new PeriodicTable();
        // Přidejte prvky do periodické tabulky (podle importu z prvky.csv nebo vlastní)

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Zadejte prvky nebo molekuly (např. H, H 2, Cl 4) nebo 'konec' pro ukončení:");

        List<String[]> userInput = new ArrayList<>();

        //JV udelat metody, jinak je to moc neprehledne
        while (true) {
            System.out.print("> ");
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("konec")) {
                break;
            }

            String[] parts = input.split(" ");
            userInput.add(parts);

            String symbol = parts[0];
            int count = parts.length > 1 ? Integer.parseInt(parts[1]) : 1;

            Element element = null;
            for (Element e : periodicTable.getElements()) {
                if (e.getSymbol().equalsIgnoreCase(symbol)) {
                    element = e;
                    break;
                }
            }

            if (element == null) {
                System.out.println("Neznámý prvek: " + symbol);
                userInput.remove(userInput.size() - 1);
                continue;
            }

            if (count > 1) {
                MoleculeSame molecule = new MoleculeSame(element, count);
                System.out.printf("Relativní hmotnost molekuly %s %d je %.2f%n", symbol, count, molecule.getWeight());
            } else {
                System.out.printf("Relativní hmotnost prvku %s je %.2f%n", symbol, element.getWeight());
            }
        }

        System.out.print("Zadejte název výstupního binárního souboru: ");
        String fileName = scanner.nextLine().trim();

        if (Files.exists(Paths.get(fileName))) {
            System.out.println("Soubor již existuje. Chcete ho přepsat? (ano/ne): ");
            String overwrite = scanner.nextLine().trim().toLowerCase();

            if (!overwrite.equals("ano")) {
                fileName = fileName.replace(".", "_copy.");
            }
        }

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeInt(userInput.size());

            for (String[] inputParts : userInput) {
                String symbol = inputParts[0];
                int count = inputParts.length > 1 ? Integer.parseInt(inputParts[1]) : 1;

                Element element = null;
                for (Element e : periodicTable.getElements()) {
                    if (e.getSymbol().equalsIgnoreCase(symbol)) {
                        element = e;
                        break;
                    }
                }

                outputStream.writeUTF(element.getSymbol());
                outputStream.writeInt(count);

                double weight = count > 1 ? new MoleculeSame(element, count).getWeight() : element.getWeight();
                outputStream.writeDouble(weight);
            }

            System.out.println("Data uložena do souboru: " + fileName);
        } catch (IOException e) {
            System.err.println("Chyba při ukládání dat do souboru: " + e.getMessage());
        }

        System.out.println("Aplikace ukončena.");
    }
}
