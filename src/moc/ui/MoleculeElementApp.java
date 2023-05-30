/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moc.ui;

import java.io.IOException;
import java.util.Scanner;
import moc.app.PeriodicTableApp;

/**
 *
 * @author ul
 */
public class MoleculeElementApp {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void userMenu() throws IOException{
        PeriodicTableApp pta = new PeriodicTableApp();
        pta.loadFromFile();
        pta.loadTimeFromFile();
        int choice = 0;
        do{
            try{
                System.out.println("0) konec \n"
                        + "1) Zadata prvek nebo molekulu \n"
                        + "2) Uložit do binárního souboru \n");
                choice = sc.nextInt();       
            }catch(Exception e){
                System.out.println("Špatný výběr" + e);
            }
            switch(choice){
                case 0: break;
                case 1: addNewMolekul();
                case 2: writeMolekuls();
            }
        }while(choice!=0);
    }
    
    public static void addNewMolekul(){
        String name;
        String number;
        int choice = 1;
        do{
            try{
                System.out.println("Zadejte prvek nebo pro ukončení napište konec");
                name = sc.next(); 
                if (name.equals("konec")) {
                    break;
                }else{
                    number = sc.next();
                }              
            }catch(Exception e){
                System.out.println("Špatný výběr" + e);
            }
        }while(choice!=0);
    }

    private static void writeMolekuls() {
        
    }
}
