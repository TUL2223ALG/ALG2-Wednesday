package lukac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MoleculeElementApp {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        String nazev,symbol;
        int pocet,protCislo;
        double hmotnost;
        CollectionMoleculeSame molecules = new CollectionMoleculeSame();
        System.out.println("Zadejte elementy(nazev symbol protonove_cislo relativni_atomovou_hmotnost ) a pocet k vytvoreni molecul (Napiste konec pro ukonceni)");
        while((nazev = sc.next()) == "konec"){
            symbol = sc.next();
            protCislo = sc.nextInt();
            hmotnost = sc.nextDouble();
            pocet = sc.nextInt();
            Element el = new Element(nazev,symbol,protCislo,hmotnost);
            MoleculeSame ms = new MoleculeSame(el,pocet);
            System.out.println(ms.getWeight());
            molecules.addMolecule(ms);
        }
        System.out.println("Zadejte nazev vystupniho souboru");
        String file = sc.next();
        //JV chybi zapis
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            
        }
    }
}
