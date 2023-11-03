package JavaCore;

public class LinearSearch {
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6};
        int key=4;
        for(int i=0;i<elements.length;i++){
            if(elements[i]==key){
                System.out.println("Key found "+ elements[i]);
            }
        }
    }
}
