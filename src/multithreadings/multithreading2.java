package multithreadings;
// Implementing Runnable
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

// Extending Thread
class Mythread2 extends Thread{

    // constructor
    Mythread2()
    {
        super("Child thread2");
        System.out.println("Child2 thread is: "+ this);
        start();
    }

    public void run()
    {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child2 Thread: " + i);
                sleep(700);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Child2 interrupted.");
        }

        System.out.println("Exiting child2");
    }

}

public class multithreading2 {
    public static void main(String[] args) {
        new Mythread();// create new thread of Runnable implemented
        new Mythread2();// create new thrread of Thread extended

        Thread t = Thread.currentThread();
        t.setName("Hello!");
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
