package multithreadings;
public class multithreading1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread is: "+t);
        t.setName("Hey there!"); 
        System.out.println("Thread is: "+t);
        // HAS to be in a try catch block to handle Interrupt error
        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }  
    }   
}
