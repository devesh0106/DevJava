package Basic;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci Series is 0,1,1,2,3,5,8,13,21,34
        int a=0,b=1;
        System.out.print(a + "," + b);
        int n=10;
        int fibSeries=0;
        for(int i=2;i<n;i++){
            fibSeries=a+b;
            a=b;
            b=fibSeries;
            System.out.print(","+fibSeries);
        }

    }
}
