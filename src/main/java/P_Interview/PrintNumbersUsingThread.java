package P_Interview;

/*
* Write a program to print 1 to 10 using 3 thread.
T1		T2		T3
1		2		3
4		5		6
7		8		9
10
*
*
* */
public class PrintNumbersUsingThread extends Thread {
    private int start;
    private int end;

    public PrintNumbersUsingThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
    for(int i=start;i<=end;i++){
        System.out.println("Threads "+Thread.currentThread().getName()+ " : elements are  "+i);
    }
    }

    public static void main(String[] args) throws InterruptedException {
        PrintNumbersUsingThread d1 = new PrintNumbersUsingThread(1,3);
        d1.start();
        PrintNumbersUsingThread d2 = new PrintNumbersUsingThread(4,6);
        d2.start();
        PrintNumbersUsingThread d3 = new PrintNumbersUsingThread(7,10);
        d3.start();
        d1.join();
        d2.join();
        d3.join();

    }
}
