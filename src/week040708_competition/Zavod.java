package week040708_competition;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jdk.jfr.StackTrace;

public class Zavod {

    private List<Zavodnik> runners;

    public Zavod() {
        runners = new ArrayList();
    }

    public void add(Zavodnik r) {
        runners.add(r);
    }

    public void add(String name, String surname) {
        Zavodnik r = new Zavodnik(name, surname);
        add(r);
    }

    private String toText() {
        StringBuilder sb = new StringBuilder();
        for (Zavodnik runner : runners) {
            sb.append(runner.toString()).append("\n");
        }
        return sb.toString();
    }

    public String resultList() {
        Collections.sort(runners);
        return toText();
    }

    public String startList() {
        Collections.sort(runners, new ComparatorByNumber());
        return toText();
    }

    public String startListv1() {
        Collections.sort(runners, new Comparator<Zavodnik>() { //s anonymni tridou
            @Override
            public int compare(Zavodnik o1, Zavodnik o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });
        return toText();
    }

    public static Comparator COMP_BY_NUMBER = new Comparator<Zavodnik>() {
        @Override
        public int compare(Zavodnik o1, Zavodnik o2) {
            return o1.getNumber() - o2.getNumber();
        }
    };

    public String startListv2() {
        Collections.sort(runners, COMP_BY_NUMBER);
        return toText();
    }

    public static Comparator<Zavodnik> COMP_BY_NUMBERv1
            = (Zavodnik o1, Zavodnik o2) -> o1.getNumber() - o2.getNumber();

    public String startListv3() {
        Collections.sort(runners, COMP_BY_NUMBERv1);
        return toText();
    }

    public boolean loadRegistration(File registrationFile) throws IOException {
        boolean error = false;
        try ( BufferedReader br = new BufferedReader(new FileReader(registrationFile))) {
            String line, name, surname;
            int startTime, number;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("[,;]");
                name = parts[0];
                surname = parts[1];
                try { //nekompletni osetreni validity dat
                    number = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    number = 0;
                    error = true;
                }
                startTime = Integer.parseInt(parts[3]);

                Zavodnik z = new Zavodnik(name, surname);
                z.setStartingNumber(number);
                int[] time = TimeTools.secondToHMS(startTime);
                z.setStartingTime(time[0], time[1], time[2]);
                add(z);
            }
        }
        return error;
    }

}
