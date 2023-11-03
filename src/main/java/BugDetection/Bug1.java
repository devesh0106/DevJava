package BugDetection;

public class Bug1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = i;
        }
    }
}
