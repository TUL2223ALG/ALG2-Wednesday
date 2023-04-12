package week02_moreobjects;

public class PolynomApp {

    public static void main(String[] args) {
        //3.0x^2 -2.0x^1 + 1.0
        Polynom p = Polynom.getInstanceNormal(3, -2, 1);
        double[] c = {1, -2, 3}; 
        Polynom p1 = Polynom.getInstanceReverted(c);
        System.out.println(p);
        System.out.println(p1);
    }
    
}
