package week08_competitionwithfiles;

public class Runner {

    private String name;
    private String surname;
    private boolean status = false;//true-bezi false-jeste nevybehl
    private int number;
    private int time;
    private int hours;
    private int minutes;
    private int seconds;
    private int sHours;
    private int sMinutes;
    private int sSeconds;
    private int fHours;
    private int fMinutes;
    private int fSeconds;

    public Runner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setStartingNumber(int number) {
        this.number = number;
    }

    public void setStartingTime(int hours, int minutes, int seconds) {
        this.sHours = hours;
        this.sMinutes = minutes;
        this.sSeconds = seconds;
        this.status = true;
    }

    public void setFinishTime(int hours, int minutes, int seconds) {
        if (status) {
            this.fHours = hours;
            this.fMinutes = minutes;
            this.fSeconds = seconds;
            this.time = calculateTime();
        }
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public int getHours() {
        return hours;
    }

    public int getMinute() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getsHours() {
        return sHours;
    }

    public int getsMinutes() {
        return sMinutes;
    }

    public int getsSeconds() {
        return sSeconds;
    }

    public int getfHours() {
        return fHours;
    }

    public int getfMinutes() {
        return fMinutes;
    }

    public int getfSeconds() {
        return fSeconds;
    }

    @Override
    public String toString() {
        return "Zavodnik{" + "name=" + name + ", surname=" + surname + ", number=" + number + ", hours=" + hours + ", minute=" + minutes + ", seconds=" + seconds + ", sHours=" + sHours + ", sMinutes=" + sMinutes + ", sSeconds=" + sSeconds + ", fHours=" + fHours + ", fMinutes=" + fMinutes + ", fSeconds=" + fSeconds + '}';
    }

    private int calculateTime() {
        int start, finish, time, timeInSeconds;
        start = 60 * 60 * sHours + 60 * sMinutes + sSeconds;
        finish = 60 * 60 * fHours + 60 * fMinutes + fSeconds;
        time = finish - start;
        timeInSeconds = time;
        this.time = time;
        this.hours = Math.round(time / 3600);
        time = time % 3600;
        this.minutes = Math.round(time / 60);
        time = time % 60;
        this.seconds = time;
        return timeInSeconds;

    }
}
