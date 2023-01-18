package Lab_cycle;
import java.io.* ;

public class Lab_Cycle6a {
    public static void main(String[] args) {
        try{
           FileInputStream fr = new FileInputStream("src/hello.txt");     
           FileOutputStream fo = new FileOutputStream("src/hello1.txt");
            int c = fr.read();
           while(c != -1)
           {
                fo.write((char)c);
                c = fr.read();
           }
           fr.close();
           fo.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
