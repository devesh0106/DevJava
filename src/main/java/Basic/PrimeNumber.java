package Basic;

public class PrimeNumber {
    public static void main(String[] args) {
        //Prime number is divided by 1 or itself only
        int n=4,flag=0,m=n/2;
        if(n==0 || n==1){
            System.out.println("Not a prime Number");
        }
        else {
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("Not a Prime Number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Prime Number");
            }
        }

    }
}
