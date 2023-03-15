/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week03_arrayobjects;

import week01firstobjects.Point;


public class PointsTools {
    public static double distanceFromTo(Point from, Point to){
        return Math.hypot(to.getX() - from.getX(), to.getY() - from.getY());
    }
}
