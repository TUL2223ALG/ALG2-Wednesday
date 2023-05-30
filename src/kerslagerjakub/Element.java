package kerslagerjakub;

public class Element {
    private String name;
    private String symbol;
    private int pNumber;
    private double weight;
    private String date = " ";
    
public Element(String name, String symbol, int pNumber, double weight){
    this.name = name;
    this.symbol = symbol;
    this.pNumber = pNumber;
    this.weight = weight;
}
public String toString(){
    String output = this.name + this.symbol + this.pNumber + this.weight + this.date;
return output;    
}
public double getWeight(){
    return this.weight;
}
public String getName(){
    return name;
}
public String getSymbol(){
    return symbol;
}
public int getProtonNumber(){
    return pNumber;
}
public String getYear(){
    return date;
}
public void setName(String name){
    this.name = name;
}
public void setSymbol(String symbol){
    this.symbol = symbol;
}
public void setProtonNumber(int num){
    this.pNumber = num;
}
public void setWeight(double weight){
    this.weight = weight;
}
public void setYear(String year){
    this.date = year;
}

}

//JV chybi parsovani, porovnavani
