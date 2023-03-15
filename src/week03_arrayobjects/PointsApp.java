
package week03_arrayobjects;

import java.io.ObjectStreamConstants;
import java.security.spec.NamedParameterSpec;
import java.util.Scanner;
import week01firstobjects.Point;

public class PointsApp {
    static Point[] points;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Zadej pocet bodu");
        int n = sc.nextInt();
        points = new Point[n];
        loadPoints(n);
        System.out.format("%.2f", calculatePerimeter());
    }

    private static void loadPoints(int n) {
        double x,y;
        Point p;
        System.out.println("Zadej souradnice bodu");
        for (int i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            p = new Point(x, y);
            points[i] = p;
        }
    }

    private static double calculatePerimeter() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            sum += points[i].distanceFrom(points[i+1]);
            
        }
        sum += points[points.length -1].distanceFrom(points[0]);
        return sum;
    }
    
    
    
}
