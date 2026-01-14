package JavaCore;

public class BinarySearch {
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6,7};
        int key =9;
        int len= elements.length;
        int mid=len/2;

        if(key==elements[mid]){
            System.out.println("Key found at Middle "+elements[mid]+" at index " + mid);
        }

        for(int i=0;i<len;i++){
            if(i<=mid-1){
                if(key==elements[i]){
                    System.out.println("Key found in left section "+ elements[i]+" at index " + i);
                }
            }
            if(i>=mid+1){
                if(key==elements[i]){
                    System.out.println("Key found in right section "+ elements[i] +" at index " + i);
                }
            }
        }
        System.out.println("Key is not present in Array");
        }
}
