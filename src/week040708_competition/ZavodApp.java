
package week040708_competition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZavodApp {

    public static void main(String[] args) {
//        Zavodnik r1 = new Zavodnik("Alice", "Mala" );
//        r1.setStartingNumber(3);
//        Zavodnik r2 = new Zavodnik("Bob", "Maly" );
//        r2.setStartingNumber(1);
//        Zavodnik r3 = new Zavodnik("Cyril", "Stredny" );
//        r3.setStartingNumber(2);
//        
//        Zavod z = new Zavod();
//        z.add(r1);
//        z.add(r2);
//        z.add(r3);
        
        Zavod z = new Zavod();
        File registrationFile = new File("data", "registrace"
                + ".txt");
        try{
            z.loadRegistration(registrationFile);
            System.out.println(z.startList());
        }catch(FileNotFoundException e){
            System.out.println("Soubor nenalez"  + e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
