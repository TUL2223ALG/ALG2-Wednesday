
package week03_arrayobjects;

import java.util.Scanner;

public class NShapeApp {
    static NShape myShape;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej pocet bodu");
        int n = sc.nextInt();
        myShape = new NShape(n);
        loadPoints(n);
        System.out.format("%.2f%n", myShape.calculatePerimeter());
        System.out.println(myShape.getClosestToOrigin());
    }
    
    private static void loadPoints(int n){
        System.out.println("Zadej souradnice bodu");
        double x, y;
        for (int i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            myShape.add(x, y);
        }
    }
    
}
