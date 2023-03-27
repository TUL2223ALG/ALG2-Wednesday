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
public class Osoba  implements Comparable<Osoba> {

    private final int vyska, vaha, vek;
    
    public final static Comparator COMP_DLE_BMI = 
            (Comparator<Osoba>) (Osoba o1, Osoba o2) -> {
        if (o1.getBMI() < o2.getBMI()) {
            return -1;
        }
        if (o1.getBMI() > o2.getBMI()) {
            return 1;
        }
        return 0;
    };
    public final static Comparator COMP_DLE_VYSKY = 
            (Comparator<Osoba>) (Osoba o1, Osoba o2) -> o1.vyska - o2.vyska;
    public final static Comparator<Osoba> COMP_DLE_VAHY = 
            (Osoba o1, Osoba o2) -> o1.vaha - o2.vaha;

    public Osoba(int vyska, int vaha, int vek) {
        this.vyska = vyska;
        this.vaha = vaha;
        this.vek = vek;
    }

    public int getVyska() {
        return vyska;
    }

    public int getVaha() {
        return vaha;
    }

    public int getVek() {
        return vek;
    }

    public float getBMI() {
        return (float) vaha / (vyska * vyska);
    }

    public static Osoba parseOsoba(String str){
        return null;
    }
    
    @Override
    public String toString() {
        return "Osoba{" + "vyska=" + vyska + ", vaha=" + vaha + ", vek=" + vek + '}';
    }

    @Override
    public int compareTo(Osoba jinaOsoba) {
        return this.vek - jinaOsoba.vek;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.vyska;
        hash = 47 * hash + this.vaha;
        hash = 47 * hash + this.vek;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Osoba other = (Osoba) obj;
        if (this.vyska != other.vyska) {
            return false;
        }
        if (this.vaha != other.vaha) {
            return false;
        }
        return this.vek == other.vek;
    }

    

    

}
