package Array;

public class EvenPosition {
    public static void main(String[] args) {
        //Program to print the elements of an array present on even position
        int[] arr={1, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){
            if(i%2!=0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println();
        System.out.println("--------------------");
        for(int i=1;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
