package koptikv2;
import koptikv2.Weightable;

public class MoleculeSame implements Weightable {
    private Element element;
    private int numberOfElements;

    public MoleculeSame(Element element, int numberOfElements) {
        this.element = element;
        this.numberOfElements = numberOfElements;
    }

    public Element getElement() {
        return element;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    public double getWeight() { 
        return element.getWeight() * numberOfElements;
    }
}


