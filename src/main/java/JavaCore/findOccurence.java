package JavaCore;

public class findOccurence {
    public static void main(String[] args) {
        String number="89993955";
        Character key='9'; //count the occurence of this number
        char[] numChar= number.toCharArray();
        int count=0;
        for(int i=0;i<numChar.length;i++){
            if(key.equals(numChar[i])){
                count++;
            }

        }
        System.out.println("Occurence of 9 is  "+count);

        System.out.println("-----------------Find Occurence of Numbers with key----------------------------");
        int numbers = 747723;
        int nLen = String.valueOf(numbers).length();
        int[] remainder = new int[nLen];
        int key1=7,count1=0;
        for(int i=0;i<nLen;i++){
            remainder[i] = numbers%10;
            numbers=numbers/10;
            if(remainder[i]==key1){
                count1++;
            }
        }
        System.out.println("Occurence of 7 is "+ count1);

        System.out.println("-----------------Find Occurence of Numbers without key----------------------------");
        int numbers1= 662223222;
        int numbers1len = String.valueOf(numbers1).length();
        int count2=0;
        int[] remainder1= new int[numbers1len];
        for(int i=0;i<1;i++){
            for(int j=i;j<numbers1len;j++) {
                    remainder1[j] = numbers1 % 10;
                    numbers1 = numbers1 / 10;
                    if (remainder1[j] == remainder1[i]) {
                        count2++;
                    }
            }
            System.out.println("Occurence of "+ remainder1[i] + "  is  "+ count2);
        }

    }
}
