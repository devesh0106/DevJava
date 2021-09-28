package MultiThreading;

//Producer-Consumer Problem using Synchronised Keyword and Inter Thread Communication
public class Company {
    int n;
    synchronized public void produce_item(int n){
        this.n=n;
        System.out.println("Produced "+this.n);
    }
    synchronized public int consume_item(){
        System.out.println("Consumed "+this.n);
        return n;
    }
}
