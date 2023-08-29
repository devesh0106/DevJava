package Collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        String str ="Devesh";
        char[] string = str.toCharArray();
        Set<Character> ch = new HashSet<>();
        for( char c : string){
            if(ch.add(c)==false){
                System.out.println(c);
            }
        }
    }
}
