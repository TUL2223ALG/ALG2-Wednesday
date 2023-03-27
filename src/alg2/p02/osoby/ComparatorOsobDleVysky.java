/*
 * Copyright (C) 2022 Jirina Kralovcova
 * This program is part of Java programing education. 
 * You can use it as you need to learn Java. 
 */
package alg2.p02.osoby;

import java.util.Comparator;

/**
 *
 * @author Jirina
 */
public class ComparatorOsobDleVysky implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.getVyska() - o2.getVyska();
    }
    
}
