package exception_handling;
import java.util.Scanner;

class isNum5 extends Exception{
    isNum5(String a){
        super(a);
    }
}

public class exception_handling5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        try{
            if(a == 5)
            {
                throw new isNum5("Number is = "+a);
            }
            else{
                System.out.print("Entered number = "+a);
            }
        }
        catch(isNum5 e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }   
}
