package MultiThreading;

public class NewThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numbers are " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public static void main(String[] args) {
            System.out.println("Thread Creation in Java");
            Thread t = Thread.currentThread();
            System.out.println("Current Thread is " + t.getName());
            NewThread t1 = new NewThread();
            t1.start();
        }
    }
