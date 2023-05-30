package koptik;
import java.util.ArrayList;
import java.util.Scanner;

public class PeriodicTable {
ArrayList<Element> periodictable;

public void createNewElement(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Zadej nazev prvku");
    String name = sc.nextLine();
    System.out.println("Zadej symbol");
    String symbol = sc.nextLine();
    System.out.println("Zadej protonove cislo");
    double proton = sc.nextDouble();
    System.out.println("Zadej atomovou hmotnost");
    double relative = sc.nextDouble();
//    Element idk = Element(name,symbol,proton,relative);
//    periodictable.add(idk);
}

}
