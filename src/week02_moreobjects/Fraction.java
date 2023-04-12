package week02_moreobjects;

public class Fraction {
    
    private int numerator;
    private int denominator;
    private String fractionText;
    
    public Fraction(int numerator){
        this.numerator = numerator;
        denominator = 1;
        
        setFractionText();
    }
    
    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Jmenovatel nesmi byt 0");
        }
        int gcd = FractionTools.findGCD(numerator, denominator);
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
        
        setFractionText();
    }
    
    public Fraction(String fr){
        String[] parts = fr.split("/");
        this.numerator = Integer.parseInt(parts[0]);
        if(parts.length == 2){
            this.denominator = Integer.parseInt(parts[1]);
        }
        setFractionText();
    }
    
    private void setFractionText(){
        if (this.denominator == 1){
            fractionText = Integer.toString(this.numerator);
        } else{
            fractionText = (Integer.toString(this.numerator)+"/"+Integer.toString(this.denominator));
        }
    }
    
    @Override
    public String toString(){
        return fractionText;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    public double getValue(){
        return (double)numerator/denominator;
    }
}
