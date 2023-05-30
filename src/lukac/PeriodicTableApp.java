package lukac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PeriodicTableApp {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        //JV rozdelit si do samostatnych metod
        File prvky = new File("data/prvky.csv");
        File rokObj = new File("data/rokObjeveni.txt");
        String symbol;
        PeriodicTable pt = new PeriodicTable();
        try(BufferedReader brPrvky = new BufferedReader(new FileReader(prvky))){
            brPrvky.readLine();
            while(brPrvky.read()!= -1){
                String line = brPrvky.readLine();
                String[] parts = line.split(",");
                Element el = new Element(parts[0],parts[2],Integer.parseInt(parts[1]),Double.parseDouble(parts[3]));
                try(Scanner scRok = new Scanner(rokObj)){
                    while(scRok.hasNext()){
                        scRok.next();
                        scRok.next();
                        symbol = scRok.next();
                        int delka = pt.getLength();
                        for (int i = 0; i <= delka;i++) {
                            if (el.getSymbol() == symbol)
                                el.setRokObjeveni(scRok.nextInt());
                        }
                    }
                }
                pt.addElement(el);
                //Arrays.sort(DLE_PROT_CISLA);
            }
        }
        
    }
}
