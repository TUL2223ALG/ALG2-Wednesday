package koptik;

import java.util.Scanner;

public class MoleculeElementApp {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true){
        String line = sc.nextLine();
        String konec = "konec";
        if (line.contains(konec)){
            System.exit(0);
        }
        String input[] = line.split(" ");
        String name = input[0];
        int count = Integer.parseInt(input[1]);
        
        
    }
    }
}
