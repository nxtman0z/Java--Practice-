// -------- Using Thread Class --------
class MyThread extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


// -------- Using Runnable Interface --------
class MyRunnable implements Runnable {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


// -------- Main Class --------
public class runnablevsthread {
    public static void main(String[] args) {

        // Thread using Thread class
        MyThread t1 = new MyThread();

        // Thread using Runnable interface
        MyRunnable task = new MyRunnable();
        Thread t2 = new Thread(task);

        // Start threads
        t1.start();
        t2.start();
    }
}
