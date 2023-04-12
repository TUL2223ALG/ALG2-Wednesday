package week02_moreobjects;

public class FractionTest {

    public static void main(String[] args) {
        Fraction fr = new Fraction("6/7");
        System.out.println(fr); // fr / fr.toString
        System.out.println(fr.getNumerator() + " " + fr.getDenominator());
        System.out.println(fr.getValue());
    }
}
