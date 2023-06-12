
package Kvapil;

import java.util.Scanner;


public class UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choiceContinue = "a";
                while (choiceContinue.equals("a")) {
                    System.out.println(menu.menu);
                    System.out.println("Zadejte číslo 1-5");
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice){
                        case 1:
                            //fileTools.ReadFromStudents(credits);
                            break;
                        case 2:
                            System.out.println(menu.menu2);
                            System.out.println("Zadejte číslo 1-4");
                            int choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1){
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3: 
                                    break;
                                case 4:
                                    break;
                            }
                            break;    
                        case 3: 
                            break;    
                        case 4: 
                            break;
                        case 5: 
                            break;    
                    }
                }
                System.out.println("Chcete pokračovat? a/n");
    }
    //JV nedokončeno
}
