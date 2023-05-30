/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konerza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;

import konerza.AtomovaHmotnostCompare;


public class PeriodicTableApp {
    public static void main(String[] args) throws FileNotFoundException {
        
        PeriodicTable periodickaTabulka = new PeriodicTable();
        
        // Nacteni prvku ze souboru do periodickaTabulka
        File souborPrvky = new File("D:\\ALG2PeriodicTableKonerza\\data\\prvky.csv");
        BufferedReader br = new BufferedReader(new FileReader(souborPrvky)); //JV vyuzivat try with resources
        try{
            boolean prvniRadek = true;
            while(br.readLine() != null){ //JV nactete dalsi radek a nic s nim neudelate
                
                // Preskoceni prvniho radku s popisem struktury csv
                if(prvniRadek){
                    prvniRadek = false;
                    continue;
                }
                String[] radek = new String[8]; //JV neni potreba alokovat velikost, udela to split automaticky
                String tempRadek = br.readLine();
                radek = tempRadek.split(",");
                
                // duplikát check
                if(!periodickaTabulka.isDuplicite(Integer.parseInt(radek[1]))){
                    // addToPeriodicTable(String nazev, String symbol, int protonoveCislo, int relativniAtomHmotnost)
                    periodickaTabulka.addToPeriodicTable(radek[0], radek[2], Integer.parseInt(radek[1]), Double.parseDouble(radek[3]));     
                }
                
                br.readLine(); //JV nactete dalsi radek a nic s nim neudelate
                
            }   
        }
        
        catch(IOException e){
            System.out.println("Chyba");
        }
        
        
        // Doplneni rok objeveni
        // Nacteni prvku ze souboru do periodickaTabulka
        File souborRokObjeveni = new File("D:\\ALG2PeriodicTableKonerza\\data\\rokObjeveni.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(souborRokObjeveni)); //JV mel byt pouzit Scanner
        try{
            boolean prvniRadek = true;
            while(br2.readLine() != null){
                
                // Preskoceni prvniho radku s popisem struktury .txt
                if(prvniRadek){
                    prvniRadek = false;
                    continue;
                }
                String[] radek = new String[4]; 
                String tempRadek = br2.readLine();
                radek = tempRadek.split("[  , ]");
                ArrayList<String> radekFormatted = new ArrayList(); //JV zbytecne slozitosti
                
                for (int i = 0; i < radek.length; i++) {
                    if( !( ( "    ".equals(radek[i]) ) || ( " ".equals(radek[i ])) || ( "\n".equals(radek[i])) ) ) {
                        radekFormatted.add(radek[i]);
                        System.out.println(radek[i]);
                    }
                }
                
                // ArrayList radek formated = jeden radek rozdeleny po mezerach/tabech
                
                //System.out.println(radekFormatted.get(4));
                
                String symbol = radekFormatted.get(2);
                int datumObjeveni;
                
                if(radekFormatted.get(3).equals("N")){
                    datumObjeveni = 0;
                }
                else{
                    datumObjeveni = Integer.valueOf(radekFormatted.get(3));
                }
                
                
                
                periodickaTabulka.setElementDate(symbol,datumObjeveni);
                

                br.readLine();
            }   
        }
        
        catch(IOException e){
            System.out.println("Chyba");
        }
        
        
        // c. Vypsat 10 prvku s nejvyssi relativni atomovou hmostnosti
        
        // serazeni prvku
        periodickaTabulka.sortElementsByWeight();
        
        // vypsani prvnich 10 prvku
        periodickaTabulka.printTopTenElements();
        
        // vypsani nejstarsiho prvku
        periodickaTabulka.sortElementsByDate();
        periodickaTabulka.printTopElement();
        

        
    }
    
}
