public class Time1 {

    private int hour;
    private int minutes;
    private int seconds;

    void setHour(int hour){
        if (hour<0 || hour>23)
            throw new IllegalArgumentException("wrong hour");
        this.hour=hour;
    }

    void setMinutes(int minutes){
        if (minutes<0 || minutes>59)
            throw new IllegalArgumentException("wrong minutes");
        this.minutes=minutes;
    }

    void setSeconds(int seconds){
        if (seconds<0 || seconds>59)
            throw new IllegalArgumentException("wrong seconds");
        this.seconds=seconds;
    }

    Time1(int hour, int minutes, int seconds){
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public String printTime(){
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);

    }



}
