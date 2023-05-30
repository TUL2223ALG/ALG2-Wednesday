package kerslagerjakub;

public class PeriodicTableApp {
    public static void main(String[] args) {
        String old;
        old = PeriodicTable.oldest();
        String[] hmotnosti = new String[10];
        hmotnosti = PeriodicTable.highestAtomWeight();
        for (int i = 0; i < hmotnosti.length; i++) {
            System.out.print(hmotnosti[i]+ " ");
        }
    

        System.out.println(old);
        
    }

    
}
