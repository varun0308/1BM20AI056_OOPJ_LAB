abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    int x,y,z;
    A(int a, int b, int c)
    {
        this.x = a;
        this.y = b;
        this.z = c;
    }
    double getPercentage()
    {
        return (x+y+z)/300 ;
    }

}

class B extends Marks{
    int w,x,y,z;
    B(int a, int b, int c, int d)
    {
        this.x = a;
        this.y = b;
        this.z = c;
        this.w = d;
    }
    double getPercentage()
    {
        return (w+x+y+z)/400 ;
    }

}

public class ques_3 {
    public static void main(String args[])
    {
        A obj1 = new A(60,70,80);
        System.out.println(obj1.getPercentage());

        B obj2 = new B(60,70,80,90);
        System.out.println(obj2.getPercentage());
    }

}