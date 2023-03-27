/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package alg2.p02.osoby;

import java.util.Comparator;

/**
 *
 * @author 
 */
public class ComparatorOsobDleVahy implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getVaha() - o2.getVaha();
    }
}
