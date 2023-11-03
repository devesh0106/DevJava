package BugDetection;

public class ReverseStringBug {
    public static void main(String[] args) {
        String str ="Devesh";
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        System.out.println(result.toString());
    }
}
