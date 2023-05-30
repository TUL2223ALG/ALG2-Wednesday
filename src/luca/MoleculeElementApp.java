package luca;

import java.util.Scanner;

public class MoleculeElementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PeriodicTable periodicTable = new PeriodicTable();
        FileTools.readFromElements(periodicTable);
        periodicTable.setYears(FileTools.readFromYearsFounded());

        String choice = "";
        int countElMol = 0;
        while (!choice.equals("konec")) {
            System.out.println("Zadejte nazev prvku/molekuly/konec");
            choice = scanner.nextLine();
            if (choice.equals("konec")) {
                System.exit(0);
            } else {
                String[] strArr = choice.split(" ");
                double relativeWeight;
                if (strArr.length == 1) {
                    relativeWeight = periodicTable.getRelativeWeightOfElement(choice);
                } else {
                    relativeWeight = periodicTable.getRelativeWeightOfElement(strArr[0], Integer.parseInt(strArr[1]));
                }
                countElMol++;
                System.out.println("Relativni hmotnost: " + relativeWeight);

            }
        }

        System.out.println("Zadejte nazev vystupniho binarniho souboru");
        String nameOfBinaryFile = scanner.nextLine();
        FileTools.saveElementToBinaryFile(nameOfBinaryFile);
    }
}
