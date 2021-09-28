package MultiThreading;

public class MainClass {
    public static void main(String[] args) {
        Company c=new Company();
        Producer p=new Producer(c);
        Consumer con = new Consumer(c);
        p.start();
        con.start();
    }
}
