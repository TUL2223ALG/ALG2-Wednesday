/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kerslagerDan.objects;

import kerslagerDan.interfaces.Weightable;
/**
 *
 * @author ul
 */
public class MoleculeSame {
    Element element;
    int pocet;
    double hmotnost;
    
    public void moleculeSame(Element element, int pocet){
        this.element=element;
        this.pocet=pocet;
        this.hmotnost=element.getWeight()*pocet;
    }
    //JV pri pretezovani volat se navzajem
    public void moleculeSame(Element element){
        this.element=element;
        this.pocet=1;
        this.hmotnost=element.getWeight()*pocet;
    }
    public double getWeight(){ //Implements Weightable. not sure about syntax
        return hmotnost;
    }
    @Override
    public String toString(){ //JV stacilo by pouzit String.format
        StringBuilder sb = new StringBuilder();
        sb.append(element.getSymbol()).append("\n");
        sb.append(pocet).append("\n");
        sb.append(hmotnost).append("\n");
        return sb.toString();
    }
}
