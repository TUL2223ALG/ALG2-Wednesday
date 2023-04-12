package week03_arrayobjects;

import week01_firstobjects.Point;


public class PointsTools {
    public static double distanceFromTo(Point from, Point to){
        return Math.hypot(to.getX() - from.getX(), to.getY() - from.getY());
    }
}
