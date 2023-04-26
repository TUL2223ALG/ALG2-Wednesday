package week040708_competition;

public class ZavodnikTest {
    public static void main(String[] args) {
        Zavodnik michal = new Zavodnik("Michal","Novotny");
        michal.setStartingNumber(1);
        michal.setStartingTime(6, 20, 45);
        michal.setFinishTime(7, 50, 30);
        System.out.println(michal.getTime());
    }
}
