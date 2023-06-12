package stitak;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ul
 */
public class ElearningStitak {

    public static void main(String[] args) {
        try {
            Elearning elearning = new Elearning();
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("1: Načtení souboru.");
                System.out.println("2: Přehled zápočtů.");
                System.out.println("3: Nárok na zápočet u studenta.");
                System.out.println("4: Uložení dat.");
                System.out.println("0: Ukončení programu.");
                int menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Zadejte název souboru:");
                        String path = "data/" + sc.nextLine() + ".csv";
                        sc.nextLine();
                        elearning.load(path);
                        break;
                    case 2: //JV chybi
                    case 3:
                        System.out.println("Chcete zadat:");
                        System.out.println("1: jméno");
                        System.out.println("2: číslo studenta");
                        int menu1 = sc.nextInt();
                        switch (menu1) {
                            case 1:
                                System.out.println("Napiště první křestní jméno a poté přijmení oddělené mezerou");
                                String zapocet = sc.nextLine();
                                boolean zapocetTrue = elearning.narokNaZapocetJmeno(zapocet);
                                if (zapocetTrue == true) {
                                    System.out.println("Má nárok na zápočet.");
                                } else {
                                    System.out.println("Nemá nárok na zápočet.");
                                }
                                break;
                            case 2:
                                System.out.println("Osobní číslo:");
                                String zapocet2 = sc.nextLine();
                                elearning.narokNaZapocetCislo(zapocet2);
                                //vypis
                        }
                        break;
                    case 4:
                        elearning.UlozeniDat();
                        break;
                    case 0:
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Soubor se nepovedlo načíst.");
        }
    }
}
