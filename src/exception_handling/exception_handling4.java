// Nested try block
// Inner handles ArithmeticException
// Outer handles FileNotFoundException
package exception_handling;
import java.io.* ;
// import java.io.FileInputStream;

public class exception_handling4 {
    public static void main(String[] args) throws IOException
    {
        try
        {
            FileInputStream fl = new FileInputStream("src/hello.txt");
            int i = fl.read();
            try{
                int k = i/0 ;
                System.out.println(k);
            }
            catch(ArithmeticException e){
                System.out.println("Oops Arithmetic error!");
            }
            fl.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File doesn't exist");
        }
        
    }
}
