/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package objectsarray;

import firstobjects.Point;
import java.util.ArrayList;
import java.util.Scanner;
import static objectsarray.NShapeApp.sc;

/**
 *
 * @author 
 */
public class NShapeApp3 {
    public static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        NShape shape = new NShape();
        System.out.println("Zadej pocet bodu");
        int n = sc.nextInt();
        System.out.println("Zadej body:");
        double x, y;
        Point p;
        for(int i = 1; i <= n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            shape.addPoint(x, y);
        }
        System.out.println(shape.getClosestPoint());
    
    }
}
