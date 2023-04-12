package week01_firstobjects;

public class MoneyBoxApp {

    public static void main(String[] args) {
        MoneyBox alice = new MoneyBox("Alice",3,5);
        MoneyBox bob = new MoneyBox("Bob");
        final int CENA_HAMBURGER = 39;
        bob.pridejJednoKorunu();
        bob.pridejJednoKorunu();
        bob.pridejDvouKorunu();
        bob.pridejDvouKorunu();
        bob.pridejDvouKorunu();
        bob.pridejKoruny(5, 10);
        System.out.format("Alice ma %d a Bob ma %d \n",alice.getValue(),bob.getValue());
        System.out.println(alice.toString());
        System.out.println(bob.toString());
        System.out.println("Bob " + (bob.jeDostPenezNa(CENA_HAMBURGER)?"ma":"nema") + " na hamburger");
        System.out.println("Alice " + (alice.jeDostPenezNa(CENA_HAMBURGER)?"ma":"nema") + " na hamburger");
        if (alice.getValue() > bob.getValue()){
            System.out.println("Alice ma vic penez");
        }
        else {
            System.out.println("Bob ma vic penez"); 
        }
        bob.setName("Alice");
        alice.pridejKoruny(bob.getPocetJednoKorun(), bob.getPocetDvouKorun());
        //bob vynulovat ucet
        bob.transfer(bob.getPocetJednoKorun(), bob.getPocetDvouKorun(), alice);
    }
}
