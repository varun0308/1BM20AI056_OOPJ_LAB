class Mythread implements Runnable{
    Thread t;

    // constructor
    Mythread()
    {
        t = new Thread(this, "Demo thread");
        System.out.println("Child thread is: "+t);
        t.start();
    }

    public void run()
    {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }

        System.out.println("Exiting child");
    }

}

public class multithreading2 {
    public static void main(String[] args) {
        new Mythread();

        Thread t = Thread.currentThread();
        System.out.println("Main thread is: "+t);
        try {
            for(int i = 5; i > 0; i--) {
            System.out.println("Main Thread: " + i);
            Thread.sleep(500);
            }
            } 
        catch (InterruptedException e) {
            System.out.println("Main interrupted.");
            }
        System.out.println("Exiting main");
    }
}
