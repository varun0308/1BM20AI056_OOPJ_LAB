package Lab_cycle;
import java.util.* ;
class Myexception extends Exception{
    Myexception(String message){
        super(message);
    }
    public String toString(){
        return "Temprature is 0 [toString override]" ;
    }
}

class Temprature{
    int temp;
    Temprature(int temp)
    {
        this.temp = temp;
    }
    void Kelvin() throws Myexception{
        if(temp == 0)
        {
            throw new Myexception("Temprature is 0 [with super]");
        }
        System.out.println("Kelvin temp is "+(temp+273));
    }
}

public class Lab_Cycle5b {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            Temprature t = new Temprature(temp);
            t.Kelvin();
            sc.close();
        }
        catch(Myexception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
