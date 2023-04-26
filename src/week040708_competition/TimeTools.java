package week040708_competition;

public final class TimeTools {
    private TimeTools(){
        
    }
    
    public static int [] secondToHMS(int seconds){
        int[] time = new int[3];
        time[0] = seconds/3600;
        time[1] = seconds%3600/60;
        time[2] = seconds%3600%60;
        return time;
    }
}
