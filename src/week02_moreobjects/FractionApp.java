package week02_moreobjects;

import java.util.Scanner;

public class FractionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator;
        int denominator;
        char choice;
        do {
            System.out.println("Zadej 1. zlomek (čitatel a jmenovatel)");
            numerator = sc.nextInt();
            denominator = sc.nextInt();
            Fraction fr1 = new Fraction(numerator, denominator);
            System.out.println(fr1);
            System.out.println("Zadej 2. zlomek");
            numerator = sc.nextInt();
            denominator = sc.nextInt();
            Fraction fr2 = new Fraction(numerator, denominator);
            System.out.println(fr2);
            System.out.println("Součet");
            System.out.println(FractionTools.sum(fr1, fr2));
            System.out.println("Rozdíl");
            System.out.println(FractionTools.difference(fr1, fr2));
            System.out.println("Násobení");
            System.out.println(FractionTools.multiplication(fr1, fr2));
            System.out.println("Dělení");
            System.out.println(FractionTools.division(fr1, fr2));
            System.out.println("Chcete pokračovat? (a/n)");
            choice = sc.next().charAt(0);
        } while (choice == 'a');
        //System.out.println(fr.getFraction());
        //System.out.println(fr.getNumerator() + " " +fr.getDenominator());
        //System.out.println(fr.getValue());

    }

}
