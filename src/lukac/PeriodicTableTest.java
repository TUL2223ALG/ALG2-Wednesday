package lukac;

public class PeriodicTableTest {
    public static void main(String[] args) {
        PeriodicTable pt = new PeriodicTable();
        Element h = new Element("Vodik","H",1,1.01);
        Element o = new Element("Kyslik","O",8,16.00);
        Element cl = new Element("Chlor","Cl",17,35.45);
        pt.addElement(h);
        pt.addElement(o);
        pt.addElement(cl);
        cl.setRokObjeveni(1774);
                
        MoleculeSame h2 = new MoleculeSame(h, 2);
        MoleculeSame o3 = new MoleculeSame(o, 3);
        System.out.println(h2.getWeight());
        System.out.println(o3.getWeight());
        
    }
}
