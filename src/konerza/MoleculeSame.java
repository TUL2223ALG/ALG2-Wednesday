/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konerza;

/**
 *
 * @author ul
 */
public class MoleculeSame implements Weightable {
    Element prvek;
    int mnozstviPrvku;
    
    
    public MoleculeSame(Element prvek, int mnozstviPrvku){
        this.prvek = prvek;
        this.mnozstviPrvku = mnozstviPrvku;
    }
    
    @Override
    public double getWeight() {
        return (this.prvek.getWeight() * (double) mnozstviPrvku);
    }
}
