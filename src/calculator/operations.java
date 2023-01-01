package Calculator;

public class operations {
    int a,b;
    operations()
    {
        ;
    }
    public operations(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    public int sum()
    {
        return a+b;
    }
        
    public int difference()
    {
        return a-b;
    }
    public int product()
    {
        return a*b;
    }
    public double divide()
    {
        return a/b;
    }
}