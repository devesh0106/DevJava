package Array;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        //Program to print the duplicate elements of an array
        int[] arr=new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("---------Using Optimise approach--------");
        HashSet<Integer> hs = new HashSet<>();
        System.out.print(" Duplicate elements " );
        for(int i=0;i<arr.length;i++){
            if(hs.add(arr[i])==false){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("   ");
        System.out.println("---------Using Brute Force approach--------");
        System.out.print(" Duplicate elements " );
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
