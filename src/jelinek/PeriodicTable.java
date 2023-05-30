/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jelinek;

import java.util.ArrayList;

/**
 *
 * @author ul
 */
public class PeriodicTable {
    ArrayList<Element> list = new ArrayList(); //JV tohle radši dělat v konstruktoru
    
    public void fillList(Element element){
        list.add(element);
    }
    public ArrayList<Element> printList(){
        return list; //JV vracet defenzivni kopii
    }
    public int getSize(){
        return list.size();
    }
    public void setDate(ArrayList<Element> list,String name,int date){
        for (int i = 0; i < list.size(); i++) {
           if(list.get(i).getSymbol().equals(name)) {
               list.get(i).setYear(date);
           }
        }
    }
    
}
