enum days{
    MANDAY,
    TUESDAY,
    WEDNESDAY
}

class verify{
    days x;
    void isHoliday(days x)
    {
        if(days.WEDNESDAY == (x))
        {System.out.println(x+" IS Not a holiday");}
    }
}

public class weekdays {
    public static void main(String[] args) {
        verify v = new verify();
        for(days x: days.values())
        {
            v.isHoliday(x);
        }
    }   
}
