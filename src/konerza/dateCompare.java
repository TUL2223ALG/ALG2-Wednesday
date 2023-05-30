/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konerza;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author ul
 */

public class dateCompare implements Comparator<Element> {
    
    @Override
    public int compare(Element o1, Element o2) {
        int vysledek = (int) (o1.getDate() - o2.getDate());
        return vysledek;
    }
    
}
