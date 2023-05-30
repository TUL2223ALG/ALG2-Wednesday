package lukac;

public class MoleculeSame implements Weightable{
    private Element el;
    private int elCount;
    
    public MoleculeSame(Element el, int count){
        this.el = el;
        this.elCount = count;
    }
    
    @Override
    public double getWeight(){
        return el.getWeight() * elCount;
    }
}
