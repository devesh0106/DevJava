package Basic;

public class Palindrome {
    //when n=121 or name="aba"
    public static void main(String[] args) {
        int n=121;int revNum=0; int nLen= (String.valueOf(n)).length();int rem=0;
        for(int i=0;i<nLen;i++){
            rem = n%10;
            n=n/10;
            revNum=rem+(revNum*10);
        }

        System.out.println(revNum);
    }

}
