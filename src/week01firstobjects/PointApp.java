package week01firstobjects;

public class PointApp {

    public static void main(String[] args) {
        int xa = 2;
        int ya = 1;
        int xb = 3;
        int yb = 4;
        
        //Point pointA = new Point(); existuje defaultne jenom, kdyz neexistuje jiny konstruktor
        Point pointA = new Point(xa, ya);
        System.out.println(pointA.distance());
        
        Point pointB = new Point(xb, yb);
        System.out.println(pointB.distance());
        
        Point pointC = new Point();
        System.out.println(pointC.distance());
        
        System.out.println(pointA); //println automaticky vola toString metodu
        System.out.println(pointA.getX());
    }
    
}
