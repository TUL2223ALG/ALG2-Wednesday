package week040708_competition;

import java.util.Comparator;

public class ComparatorByNumber implements Comparator<Zavodnik> {

    @Override
    public int compare(Zavodnik o1, Zavodnik o2) {
       return o1.getNumber() - o2.getNumber();
    }
    
}
