package MultiThreading;

public class PrintNumbers extends Thread {

    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    int start,end;

    @Override
    public void run() {
        for(int i=start;i<=end;i++){
            System.out.println("Element of  " + Thread.currentThread().getName() +":"+ i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintNumbers p1 = new PrintNumbers(1,3);
        PrintNumbers p2 = new PrintNumbers(4,6);
        PrintNumbers p3 = new PrintNumbers(7,10);
        p1.start();
        p2.start();
        p3.start();

        p1.join();
        p2.join();
        p3.join();
    }
}
