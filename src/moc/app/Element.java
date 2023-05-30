/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moc.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ul
 */
public class Element implements Weightable, Comparable<Element> {
    
    private String name;
    private String symbol;
    private int protonNumber;
    private double weight;
    private int year = 0;
    private double relativAtomWeight;
    private Random random = new Random();
    
    public Element(String name, String symbol, int protonNumber, double weight) {
        this.name = name;
        this.symbol = symbol;
        this.protonNumber = protonNumber;
        this.weight = weight;
        this.relativAtomWeight = getWeight(weight);
    }   
    
    private int checkYear(String year){
        if(year.equals("N")){           
            return random.nextInt(223)+1800;
        }
        return Integer.parseInt(year);
    }
    
    public void setYearFromFile(Scanner sc) throws IOException {
        String temp = sc.next();
        if(temp != null){
            this.year = checkYear(temp);
        }else{
            checkYear("N");
        }
    }
    
    public static Element loadFromFile(BufferedReader br) throws IOException {
        String row = br.readLine();
        if(row == null){
            return null;
        }
        String[] columns = row.split(",");
        String name = columns[0];
        String symbol = columns[2];
        int protonNumber = Integer.parseInt(columns[1]);
        double weight = Double.parseDouble(columns[3]);
        return new Element(name,symbol,protonNumber,weight);
    }

    @Override
    public double getWeight(double wieght) { //JV keď niečo chcete get tak to nema vstupny argument
        return 5;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
    

    public int getYear() {
        return year;
    }

    public void setYearWithoutFile() {
        this.year = random.nextInt(223)+1800;
    }
    
    public String toString(){
        return String.format("%s, %s, %d, %f, %d", name, symbol, protonNumber, weight, year);
    }

    @Override
    public int compareTo(Element o) {
        return (int) (this.relativAtomWeight - o.relativAtomWeight);
    }
    
    //chybi parsovani
}
