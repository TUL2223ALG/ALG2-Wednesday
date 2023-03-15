/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week02_objectin;

import java.time.temporal.Temporal;
import java.util.Arrays;

/**
 *
 * @author 
 */
public class Polynom {
    private double[] coefficients; //null //1, -2, 3
    
    //public Polynom(double[] coefficients, boolean isReverted){ //3, -2, 1
    //}
    
    private Polynom(double[] revertedCoefficients){ //1, -2, 3
        this.coefficients = Arrays.copyOf(revertedCoefficients, revertedCoefficients.length);
    }
    
    //tovarni metoda, factory method
    public static Polynom getInstanceNormal(double...coefficients){ //vararg
        double temp;
        for(int i = 0; i < coefficients.length/2; i++){
           temp = coefficients[i];
           coefficients[i] = coefficients[coefficients.length - 1 - i]; 
           coefficients[coefficients.length - 1 - i] = temp;
       }
       return new Polynom(coefficients);
    }
    
    public static Polynom getInstanceReverted(double [] revertedCoefficients){
        return new Polynom(revertedCoefficients);
    }
    
    }
