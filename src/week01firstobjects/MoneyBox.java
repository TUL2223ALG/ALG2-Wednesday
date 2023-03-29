package week01firstobjects;

public class MoneyBox {
    private String name;
    private int pocetJednoKorun;
    private int pocetDvouKorun;

    public MoneyBox(String name) {
        this.name = name;
        this.pocetJednoKorun = 0;
        this.pocetDvouKorun = 0;
    }
    
    public MoneyBox(String name, int pocetJednoKorun, int pocetDvouKorun) {
        this.name = name;
        this.pocetJednoKorun = pocetJednoKorun;
        this.pocetDvouKorun = pocetDvouKorun;    
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getValue(){
        return pocetJednoKorun + pocetDvouKorun*2;
    }
    
    public void pridejJednoKorunu(){
        pocetJednoKorun++;
    }
    
    public void pridejDvouKorunu(){
        pocetDvouKorun++;
    }
    
    public void pridejKoruny(int pridejJednokorun, int pridejDvoukorun){
        if (pridejJednokorun < 0){
            return;
        }
        if (pridejDvoukorun < 0){
            return;
        }
        pocetJednoKorun += pridejJednokorun;
        pocetDvouKorun += pridejDvoukorun;
    }
    
    @Override
    public String toString(){
        return "V pokladnicce \"" + name + "\" je " + getValue() + "Kc - " + pocetJednoKorun + " jednokorun a " + pocetDvouKorun + " dvoukorun.";
    }
    
    public boolean jeDostPenezNa(int cenaDarku){
            return getValue()>= cenaDarku;
    }
    
    public void transfer(int jednoKoruny, int dvouKoruny, MoneyBox to){
        //kontrola jestli this ma tolik penez
        this.pocetJednoKorun -= jednoKoruny;
        this.pocetDvouKorun -= dvouKoruny;
        to.pridejKoruny(jednoKoruny, dvouKoruny);
    }

    public int getPocetJednoKorun() {
        return pocetJednoKorun;
    }

    public int getPocetDvouKorun() {
        return pocetDvouKorun;
    }
    //ZMena
    
    
}
