package Array;

import jdk.internal.util.xml.impl.Input;

public class LeftRotateArray {
    public static void main(String[] args) {
        //Program to left rotate the elements of an array
       /* Input
        arr = [1, 2, 3, 4, 5]
        Here, n determine the number of times an array should be rotated
        n = 3
        Output
        Original array: 1 2 3 4 5
        Array after left rotation: 4 5 1 2 3 */
        int[] arr=new int[]{1, 2, 3, 4, 5};
        //int[] res= new int[arr.length];
        int n=3 ;
        int j;
        for(int i=0;i<n;i++){
            int first=arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
