/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_objectin;

/**
 *
 * @author
 */
public class FractionTools {

    public static int findGCD(int numerator, int denominator) {
        int x = Math.abs(numerator);
        int y = Math.abs(denominator);
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) { 
            if (x % i == 0 && y % i == 0) 
            {
                gcd = i;
            }
        }
        return gcd;
    }
    public static Fraction sum(Fraction a, Fraction b){
        int denominator = a.getDenominator()*b.getDenominator();
        int numerator = a.getNumerator()*b.getDenominator()+b.getNumerator()*a.getDenominator();
        Fraction frac = new Fraction(numerator, denominator);
        return frac;
    }
    
    public static Fraction difference(Fraction a, Fraction b){
        int denominator = a.getDenominator()*b.getDenominator();
        int numerator = a.getNumerator()*b.getDenominator()-b.getNumerator()*a.getDenominator();
        Fraction frac = new Fraction(numerator, denominator);
        return frac;
    }
    
    public static Fraction multiplication(Fraction a, Fraction b){
        int denominator = a.getDenominator()*b.getDenominator();
        int numerator = a.getNumerator()*b.getNumerator();
        Fraction frac = new Fraction(numerator, denominator);
        return frac;
    }
    
    public static Fraction devision(Fraction a, Fraction b){
        int denominator = a.getDenominator()*b.getNumerator();
        int numerator = a.getNumerator()*b.getDenominator();
        Fraction frac = new Fraction(numerator, denominator);
        return frac;
    }
}
