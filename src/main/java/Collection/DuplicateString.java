package Collection;

import java.util.HashSet;
import java.util.Set;
//remove Duplicate Elements
public class DuplicateString {
    public static void main(String[] args) {
        String str ="abracadabdra";
        int visited=-1;
        char[] string = str.toCharArray();
        Set<Character> ch = new HashSet<>();
        for( char c : string){
            ch.add(c);
        }
        System.out.println(ch);
    }
}
