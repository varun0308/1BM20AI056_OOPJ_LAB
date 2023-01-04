package exception_handling;

class ispositive extends Exception{
    ispositive(String error)
    {
        super(error);
    }
}
public class exception_handling6 {
    public static void main(String args[])
    {
        int a = 5, b = 2;
        int diff = a-b;
        try{
            if(diff > 0)
                throw new ispositive("Difference is positive");
            else 
                System.out.println("Difference is Negative");
        }
        catch(ispositive e)
        {
            System.out.println("Caught");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
