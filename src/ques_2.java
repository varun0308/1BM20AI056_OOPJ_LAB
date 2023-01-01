class Clock{
    private int hours, minutes, seconds;
    Clock()
    {
        this.hours = 10;
        this.minutes = 35;
        this.seconds = 9;
    }
    Clock(int a, int b, int c)
    {
        this.hours = a;
        this.minutes = b;
        this.seconds = c;
    }
    Clock(int a)
    {
        this.hours = a%3600;
        this.minutes = a%60;
        this.seconds = a - hours*3600 - minutes*60;
    }
    int getHours()
    {
        return hours;
    }
    int getMinutes()
    {
        return minutes;
    }
    int getSeconds()
    {
        return seconds;
    }
    void tick()
    {
        seconds += 1;
        if(seconds == 60)
        {
            seconds = 0;
            minutes += 1;
        }
        if(minutes == 60)
        {
            minutes = 0;
            hours += 1;
        }
    }
    void addClock(Clock x)
    {
        this.hours = x.hours;
        this.minutes = x.minutes;
        this.seconds = x.seconds;
    }
    public String toString()
    {
        String hi = "("+Integer.toString(hours)+":"+Integer.toString(minutes)+":"+Integer.toString(hours)+")";
        return hi;
    }
}

public class ques_2 {
    public static void main(String args[])
    {
        Clock time = new Clock(4,6,18);
        String time_in_string = time.toString();
        System.out.println(time_in_string);
    }
}
