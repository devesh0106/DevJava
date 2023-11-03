package Array;

public class ToCopyAllElements {
    public static void main(String[] args) {
        //To  copy all elements of one array into another array
        int[] FromArr = {1,2,3,4,5};
        int[] ToArr = new int[FromArr.length];
        for(int i=0;i<FromArr.length;i++){
            ToArr[i] = FromArr[i];
        }
        System.out.print("elements copied into new Array : ");
        for(int i=0;i<FromArr.length;i++) {
            System.out.print(ToArr[i]+" ");
        }
    }
}
