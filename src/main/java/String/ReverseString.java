package String;

public class ReverseString {
    public static void main(String[] args) {
        String str= "Devesh";
        String revStr = " ";
        for(int i=str.length()-1;i>=0;i--){
            revStr = revStr + str.charAt(i);
        }
        System.out.println("Reversed String is "+revStr);

        System.out.println("-----Other Approach------");
        System.out.println();
        String revString= " ";
        char[] strToChar = str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(strToChar[i]);
        }
    }
}
