package Basic;

public class MinMaxwithFewestIterations {
    public static void main(String[] args) {
        //find max and min values
        int[] numbers = {1,2,2,3,5,4};
        int min = numbers[0];
        int max= numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }

            if(numbers[i]>max){
                max=numbers[i];
            }

        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}
