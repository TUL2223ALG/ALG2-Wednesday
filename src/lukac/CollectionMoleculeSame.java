package lukac;

import java.util.ArrayList;
import java.util.List;

public class CollectionMoleculeSame {
     private List molecules;
    
    public CollectionMoleculeSame(){
        molecules = new ArrayList<MoleculeSame>();
    }
    public void addMolecule(MoleculeSame ms){
        molecules.add(ms);
    }
}
