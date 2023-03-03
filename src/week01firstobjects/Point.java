package week01firstobjects;
/**
 * Represents a point in 2D
 * @author 
 */
public class Point {
    //data - vlastnost, stavy, clenske promenne, attributes, fields
    private double x; //nemenne
    private double y;
    
    //double[] coord = new double[2];
    private double distance = 0; //vypocitana
    
    //konstruktor / vytvari objekt/instanci, inicializuje
    public Point(double x, double y){
        this.x = x;
        this.y = y;
        //coord[0] = x;
        //coord[1] = y;
        distance = this.calculateDistance();
    }
    
    //pretizeny konstruktor overloaded
    public Point(){
        
    }
    
    //getter
    public double getX(){
        return x;
    }
    /*
    //setter
    public void setX(double x){
        if(x > 0){
            this.x = x;
        }
    }
    */
    /**
     * Calculates distance from origin 0,0
     * @return distance from origin 0,0
     */
    /*
    public double distance(){
        //return Math.sqrt(x*x + y*y);
        return Math.hypot(x, y);
    }
    */
    
    public double distance(){
        return distance;
    }
    
    private double calculateDistance(){
        return Math.hypot(x, y);
    }
    
    @Override
    //prekryti metody predka override
    public String toString(){
       return String.format("x = %.2f y = %.2f", x, y);
    }
}
