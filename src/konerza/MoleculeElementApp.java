/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konerza;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ul
 */
public class MoleculeElementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean konec = true;
        do{
            try{
                System.out.println("Vkladejte zde samostatne prvky a molekuly. Pokud chcete aplikaci ukoncit, vlozte slovo ´konec´.");
                String vstup = sc.nextLine();
                
                // konec
                if( vstup.equals("konec")){
                    break;
                }
                
                // vlozen prvek
                if(vstup.length() == 1){
                    
                }
                
                if(vstup.length() > 1){
                    String[] molekula = new String[2];
                    molekula = vstup.split(" ");
                }
                
                // vlozena molekula
                
            }
            catch(Exception e){
                System.out.println("Chyba, zadejte prvky ci molekuly ve spravnem formatu");
                sc.nextLine();
            }
            
            
        }while(konec);
    }
}
