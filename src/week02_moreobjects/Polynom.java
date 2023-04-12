package week02_moreobjects;

import java.util.Arrays;

public class Polynom {

    private double[] coefficients; //null //1, -2, 3

    //public Polynom(double[] coefficients, boolean isReverted){ //3, -2, 1
    //}
    private Polynom(double[] revertedCoefficients) { //1, -2, 3
        this.coefficients = Arrays.copyOf(revertedCoefficients, revertedCoefficients.length);
    }

    //tovarni metoda, factory method
    public static Polynom getInstanceNormal(double... coefficients) { //vararg
        double temp;
        for (int i = 0; i < coefficients.length / 2; i++) {
            temp = coefficients[i];
            coefficients[i] = coefficients[coefficients.length - 1 - i];
            coefficients[coefficients.length - 1 - i] = temp;
        }
        return new Polynom(coefficients);
    }

    public static Polynom getInstanceReverted(double[] revertedCoefficients) {
        return new Polynom(revertedCoefficients);
    }

    @Override
    public String toString() {
        //odladit, aby vypisovalo matematicky spravne
        StringBuilder sb = new StringBuilder();
        for (int i = coefficients.length - 1; i >= 0; i--) {
            sb.append(coefficients[i]).append("x^").append(i).append(" ");
        }
        return sb.toString();
    }
}
