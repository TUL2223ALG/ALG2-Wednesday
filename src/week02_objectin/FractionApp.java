/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week02_objectin;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 *
 * @author jana.vitvarova
 */
public class FractionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator;
        int denominator;
        char choice;
        do{
        System.out.println("Zadej hodnoty 1. zlomku (čitatel jmenovatel)");
        numerator = sc.nextInt();
        denominator = sc.nextInt();
        Fraction fr1 = new Fraction(numerator, denominator);
        System.out.println("Zadej 2. zlomek");
        numerator = sc.nextInt();
        denominator = sc.nextInt();       
        Fraction fr2 = new Fraction(numerator, denominator);
        System.out.println("Součet");
        System.out.println(FractionTools.sum(fr1, fr2));
        System.out.println("Rozdíl");
        System.out.println(FractionTools.difference(fr1, fr2));
        System.out.println("Násobení");
        System.out.println(FractionTools.multiplication(fr1, fr2));
        System.out.println("Dělení");
        System.out.println(FractionTools.devision(fr1, fr2));
            System.out.println("Chcete pokračovat? (a/n)");
            choice = sc.next().charAt(0);
        } while (choice == 'a');
        //System.out.println(fr.getFraction());
        //System.out.println(fr.getNumerator() + " " +fr.getDenominator());
        //System.out.println(fr.getValue());
        
    }
    
}
