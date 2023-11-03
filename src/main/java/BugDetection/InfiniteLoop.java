package BugDetection;

public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {

            System.out.println(i);
            // Bug: Missing increment of 'i'

        }
    }
}
