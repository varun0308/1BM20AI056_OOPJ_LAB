import java.io.* ;

public class file_handling {
    public static void main(String[] args) {
        try{
            FileInputStream fl = new FileInputStream("src/hello.txt");
            int i = fl.read();
            while(i != -1){
                System.out.print((char)i);
                i = fl.read();
            }
            FileOutputStream f = new FileOutputStream("src/hello1.txt");
            char j = 'a';
            f.write((int)j);
            fl.close();
            f.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception!!");
        }
        
    }
}
