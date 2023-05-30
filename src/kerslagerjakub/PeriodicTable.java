package kerslagerjakub;

public class PeriodicTable {
    private Element[] table; //JV, kdyz nevíte kolik bude prvku je lepsi Arraylist
    
public PeriodicTable(){
    Element[] Table = new Element[0];
    this.table = Table;
}

public void addToTable(Element add){
    Element[] newTable = new Element[this.table.length + 1];
    for (int i = 0; i < this.table.length; i++) {
        newTable[i] = this.table[i];        
    }
    newTable[newTable.length - 1] = add;
    this.table = newTable;
    
}
private Element ElOnIndex(int num){
    Element a = this.table[num];
    return a;
}
public String[] highestAtomWeight(){
    double[] maxWeights = new double[10];
    String[] output = new String[10];
    double secMax;
    String secName;
    for (int i = 0; i < table.length; i++) {
        Element a = table[i];
        secMax = a.getWeight();
        secName = a.getName();
        for (int j = 0; j < maxWeights.length; j++) {
            if(maxWeights[j] > secMax)
                j++;
            else{
                double temp = maxWeights[j];
                String tempN = output[j];
                maxWeights[j] = secMax;
                output[j] = secName;
                secMax = temp;
            }
        }
    }
return output;
}
public String oldest(){
    int old = 2023;
    String oldName;
    int temp;
    for (int i = 0; i < table.length; i++) {
        Element a = table[i];
        temp = StrToInt(a.getYear());
        if(temp < old){
            old = temp;
            oldName = a.getName();
        }
        
    }
    String output = oldName + IntToStr(2023 - old);
    return output;
}

}