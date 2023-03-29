package week04_zavodnik;

public class ZavodnikTest {
    public static void main(String[] args) {
        Zavodnik michal = new Zavodnik("Michal","Novotny");
        michal.setStartingNumber(1);
        michal.setStartingTime(6, 20, 45);
        michal.setFinishTime(7, 50, 30);
        michal.getTime();
        System.out.println(michal);
    }
}
