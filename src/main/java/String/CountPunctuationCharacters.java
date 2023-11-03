package String;
//Not Correct
public class CountPunctuationCharacters {
    public static void main(String[] args) {
        String str = "Good Morning! Mr. James Potter. Had your breakfast?";
        char[] strToChar = str.toCharArray();
        char[] punc = {'!', ',',';','.','?',':'};
        int count=0;
        for(int i=0;i<strToChar.length;i++){
            if(strToChar.equals(punc)){
                count++;
            }
        }
        System.out.println(count);
    }
}
