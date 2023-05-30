/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kerslagerDan.ui;

import java.util.ArrayList;
import java.util.Scanner;
import kerslagerDan.objects.PeriodicTable;
import kerslagerDan.data.IO;
import kerslagerDan.objects.MoleculeSame;

/**
 *
 * @author ul
 */
public class MoleculeElementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeriodicTable table = new PeriodicTable();
        String prvky= readFile("data/prvky.csv");
        String[] parsePrvky = prvky.split("\n");
        for(int i=0;i<parsePrvky.length;i++){
            table.addElement(parsePrvky[i]);
        }
        ArrayList<MoleculeSame> molecules=null;
        Boolean on=true;
        while (on){
            System.out.println("vložte symbol a počet (nebo konec)");
            String inputs = sc.nextLine();
            if(inputs.equals("konec")){
                on=false;
                break;
            }
            String[] parceInputs = inputs.split(" ");
            if (parceInputs.length == 1){
                molecules.add(MoleculeSame(findElement(parceInputs[1])));
            }
            if (parceInputs.length == 2){
                molecules.add(MoleculeSame(findElement(parceInputs[1]),toInt(parceInputs[2])));
            }
            System.out.println("Hmotnost je: " + molecules.get(molecules.size()-1).getWeight());
        }
        System.out.println("zadejte název výstupního souboru");
        String outPath=sc.next();
        if (exists(outPath)){
            System.out.println("Soubor již existuje, přejete si ho přepsat?(y/n)");
            if (!sc.next().equals("y")){
                outPath=outPath+"_copy";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(molecules.size()).append("\n");
        for (int i=0;i<molecules.size();i++){
            sb.append(molecules.get(i).toString()).append("\n");
        }
        saveFile(outPath,sb.toString());
    }
}
