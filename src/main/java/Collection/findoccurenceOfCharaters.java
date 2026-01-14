package Collection;

import java.util.HashMap;
import java.util.Map;

public class findoccurenceOfCharaters {

    public static void main(String[] args) {
        String s= "findoccurenceOfCharaters";
        Map<Character,Integer> charCount = new HashMap();
        for(int i=s.length()-1;i>=0;i--){
            if(charCount.containsKey(s.charAt(i))){
                int count = charCount.get(s.charAt(i));
                charCount.put(s.charAt(i),++count);
            }
            else
            {
                charCount.put(s.charAt(i),1);
            }
        }
        System.out.println(charCount);
        System.out.println("---------------------------");
        Map<Character,Integer> charCountOptimum = new HashMap();
        for(int i=0;i<s.length();i++){
            charCountOptimum.put(s.charAt(i), charCountOptimum.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println("String Occurence : "+charCountOptimum);
    }
}
