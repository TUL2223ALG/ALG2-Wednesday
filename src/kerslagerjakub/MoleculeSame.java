package kerslagerjakub;

public class MoleculeSame {
    private Element elem;
    private int count;
    

public MoleculeSame(Element elem, int count){
    this.elem = elem;
    this.count = count;
}
public double getMolWeight(){
    double output = this.elem.getWeight() * this.count;
    return output;
}
 
}