/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package firstobjects;

/**
 * Represents moneybox
 * @author 
 */
public class MoneyBox {
    
    
    private String name;
    //private int count1kc = 0;
    private int count1kc;
    private int count2kc;
    
    private final static int TWO = 2;
    
    public MoneyBox(String name){
        this.name = name;
        count1kc = 0;
        count2kc = 0;   
       
    }

    public MoneyBox(String name, int count1kc, int count2kc) {
        this.name = name;
        this.count1kc = count1kc;
        this.count2kc = count2kc;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getSum(){
        int sum = count1kc+count2kc*TWO;
       return sum;
    }
    
    public void addCount1kc(){
        count1kc++;
    }
    public void addCount2kc(){
        count2kc++;
    }
    public void addPocetkc(int kc, int dvoukc){
        count1kc = count1kc + kc;
        count2kc = count2kc + dvoukc;
        
    }
    @Override
    public String toString(){
        return String.format("%.f ma v pokladnicce %.f Kc - %.f x1Kc, %.f x2Kc.", name, getSum(),count1kc,count2kc);
    }
        
    public boolean isEnough(int present){
        return getSum()>= present;
    }
}
