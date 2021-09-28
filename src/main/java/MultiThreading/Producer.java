package MultiThreading;

public class Producer extends Thread{
    Company c;
    Producer (Company c){
        this.c=c;
    }
    public void run() {
        int n=1;
        while (true) {
            this.c.produce_item(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n++;
        }
    }
}
