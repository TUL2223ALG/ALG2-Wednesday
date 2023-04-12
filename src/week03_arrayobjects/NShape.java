package week03_arrayobjects;

import week01_firstobjects.Point;

public class NShape {
    private Point[] points;
    int count = 0; //skutecny pocet bodu
    
    public NShape(int n){
        points = new Point[n];
    }
    
    public boolean add(double x, double y){
        if(count < points.length){
            Point p = new Point(x, y);
            points[count] = p;
            count++;
            return true;
        }
        return false;
    }
    
    public double calculatePerimeter() {
        double sum = 0;
        for (int i = 0; i < count - 1; i++) {
            sum += points[i].distanceFrom(points[i+1]);
            
        }
        sum += points[count -1].distanceFrom(points[0]);
        return sum;
    }
    
    public Point getClosestToOrigin(){
        Point min = points[0];
        for (Point point : points) {
            if(point.distance() < min.distance()){
                min = point;
            }
        }
        return min;
    }
}
