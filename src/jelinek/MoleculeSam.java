package jelinek;

public class MoleculeSam implements Weightable {

    int numOfParts;
    Element element;

    Sloucenina sloucenina;
    
    
    public MoleculeSam(int numOfParts, Element element) {
        this.numOfParts = numOfParts;
        this.element = element;
    }
    
    
    @Override
    public Double getWeight() {
        return (element.getgMol() * numOfParts);
    }

}
