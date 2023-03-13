package objectsarray;

import firstobjects.Point;
import java.util.ArrayList;
import static objectsarray.NShapeApp.calculatePerimeter;
import static objectsarray.NShapeApp.sc;

public class NShapeApp2 {

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
        
        double perimeter = shape.calculatePerimeter();
        System.out.println(perimeter);
        
        System.out.println(shape);
        ArrayList<Point> myPoints = shape.getPoints();
        myPoints.add(new Point(0,0));
        System.out.println(shape);
    }
    
}
