package BugDetection;
/*Write a short program that prints each number from 1 to 100 on a new line.

For each multiple of 3, print "Fizz" instead of the number.
For each multiple of 5, print "Buzz" instead of the number.
For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.*/

/*Output :
1
2
fizz
4
so on */
public class FizzBuzz {
    //Bug is actually when i=15 (which is divisible by 3 and 5 both)
    public static void fizzbuzz(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) { //Rule: Always check the most specific condition first (divisible by both 3 and 5).
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0)  {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzbuzz();
    }
}