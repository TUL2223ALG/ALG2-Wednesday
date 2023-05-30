package lukac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PeriodicTable implements Comparator<Element>{
    private List elements;
    
    public PeriodicTable(){
        elements = new ArrayList<Element>();
    }
    public void addElement(Element el){
        elements.add(el);
    }
    public int getLength(){
        return elements.size();
    }
    
    public static Comparator DLE_PROT_CISLA = new Comparator<Element>(){
        @Override
        public int compare(Element o1, Element o2) {
            return o1.getProtCislo() - o2.getProtCislo();
        }
    };
    

    public int compare(Element o1, Element o2) {//dle prot cisla
        return o1.getProtCislo() - o2.getProtCislo();
    }
}
