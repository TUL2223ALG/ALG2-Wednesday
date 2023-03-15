/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week02_objectin;

/**
 *
 * @author jana.vitvarova
 */
public class PolynomApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] c = {3, -2, 1};
        Polynom p = Polynom.getInstanceNormal(c);
        Polynom p1 = Polynom.getInstanceNormal(1, -2, 3);
    }
    
}
