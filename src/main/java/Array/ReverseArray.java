package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] revArr = new int[arr.length];
        int len=arr.length;
            for (int i = len - 1; i >= 0; i--) {
                revArr[i] = arr[len-1-i];
            }
        System.out.println("reverse array " );
        for (int i = 0; i < arr.length; i++) {
            System.out.print( revArr[i]+ " ");
        }

        System.out.println( );
        System.out.println("--------------------------------");
        for (int i=len-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
