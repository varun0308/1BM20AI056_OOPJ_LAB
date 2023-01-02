import java.io.* ;

public class file_handling {
    public static void main(String[] args) {
        try{
            FileInputStream fl = new FileInputStream("src/hello.txt");
            int i = fl.read();
            while(i != -1){
                System.out.print(i);
                i = fl.read();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception!!");
        }
    }
}
