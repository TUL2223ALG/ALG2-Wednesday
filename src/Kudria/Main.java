
package Kudria;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Students students = new Students();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.Nacitani souboru");
            System.out.println("2.Prehled zapoctu");
            System.out.println("3.Narok na zapocet");
            System.out.println("4.Ulozeni dat");
            System.out.println("5.Ukonceni programu");
            
            String input = scanner.nextLine();
            try {
                switch(input){
                    case "1":
                        System.out.println("Zadejte nazev souboru");
                        String fileName = scanner.nextLine();
                        students.loadFromFile(fileName);
                        break;
                    case "2":
                        students.printEligibleStudents();
                        break;
                    case "3":
                        System.out.println("Zadejte osobni cislo nebo jmeno studenta");
                        String  studentIdOrName = scanner.nextLine();
                        students.checkStudentEligiblity(studentIdOrName);
                        break;
                    case "4":
                        students.saveToTextFile("eligible_students.txt");
                        students.saveToBinaryFile("subjct_data.bin");
                        break;
                    case "5":
                        System.exit(0);
                        break;
                    default:
                     System.out.println("Neplatny vyber");
                } 
                           } catch(IOException e){
                               System.out.println("Chyba " + e.getMessage());
                           }catch(Exception e){
                               System.out.println("Chyba " + e.getMessage());
                           }
        }
        
    }


}
    