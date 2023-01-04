package exception_handling;
import java.util.* ;
// Denominator = 0 ---> Exception

public class exception_handling1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c;
        try{
            c = a/b;
            System.out.println("Value of c is: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Eexception !!!");
            System.out.println("a or b value is 0");
        }
        System.out.println("Progam terminated!");
        System.out.println("Sum of a and b is: "+ (a+b));

        sc.close();
    }
}