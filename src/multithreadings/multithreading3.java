package multithreadings;

class thread2 extends Thread{
    int x;
    thread2(int x){
        super("Thread 2");
        this.x = x;
        start();
    }
    public void run()
    {
        System.out.println("Square of integer: "+x+" is "+x*x);
    }
}

class thread3 extends Thread{
    int x;
    thread3(int x){
        super("Thread 2");
        this.x = x;
        start();
    }
    public void run()
    {
        System.out.println("Cube of integer: "+x+" is "+x*x*x);
    }
}
public class multithreading3 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            try{
                int num = i*i + 1;
                System.out.println("New number is: "+ num);
                new thread2(num);
                new thread3(num);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Child interrupted.");
            }
            
        }
    }
}
