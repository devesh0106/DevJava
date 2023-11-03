package Array;

public class SortElements {
    public static void main(String[] args) {
        int[] arr= {7,3,54,1,9};
        int temp=0;

        System.out.println("-----ascending order-----");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in ascending order ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("-----descending  order-----");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in descending  order ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
