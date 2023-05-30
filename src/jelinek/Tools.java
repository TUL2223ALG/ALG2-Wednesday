/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jelinek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ul
 */
public class Tools implements Weightable{

    public String[] getInput(String sc) {
        String[] input = new String[4]; //JV před splitem neinicilizujte velikost pole
        input = (sc.split(",", 5));
        return input;
    }

    public Element createElement(String[] pole,Element element,int index) {
        if (index==1) {
            element = new Element(pole[0], Integer.parseInt(pole[2]), pole[1], Double.parseDouble(pole[3]));
            return element;
        } else if (index==2) {
            element = new Element(pole[0], Integer.parseInt(pole[1]), pole[2], Double.parseDouble(pole[3]), Integer.parseInt(pole[4]));
           return element;
        }
        return null;
    }
    public String outElement(Element element){
            return element.toString();
    }
    public MoleculeSam createSum(Element element,MoleculeSam sum,int num){
        sum = new MoleculeSam(num,element);
        return sum;
    }

    public Double getWeight() {
        return getWeight();
    }
    
    
    public ArrayList sortList(ArrayList list,Element element){
        //Collections.sort(list,new Comparator.compare(element, element));  NEFUNKČNÍ
        return list;
    }
    
}
