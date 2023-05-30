/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jelinek;

import java.util.Comparator;

/**
 *
 * @author ul
 */
public class Compare implements Comparator<Element> {

    @Override
    public int compare(Element o1, Element o2) {
        return o1.getpNum()-o2.getpNum();
    }
    
    
}
