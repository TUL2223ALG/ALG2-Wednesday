/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moc.app;

/**
 *
 * @author ul
 */
public class MoleculeSame implements Weightable{
    //JV vyuzit, ze prvek uz existuje
    private String name;
    private int count;
    private double relativWeight;

    public MoleculeSame(String name, int count) {
        this.name = name;
        this.count = count;
        this.relativWeight = 5;
    } 
    
    public String displayRelativWeight(){
        return String.format("Relativní hmotnost prvku: %f",relativWeight);
    }
    
    
    @Override
    public String toString(){
        return String.format("Jméno: %s \n Atoms: %d \n Wieght: %f",name,count,relativWeight);
    }
    
    
    @Override
    public double getWeight(double weight) {
        return 5;
    } 
}
