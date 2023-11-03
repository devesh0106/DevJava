package JavaCore;

import java.util.Arrays;
import java.util.List;

public class FindFirstUsingChar {
    public static void main(String[] args) {
        char key = 'b';
        List<String> ls = Arrays.asList("apple","banana","grapes","blueberry");
        System.out.println(ls.stream().filter(e->e.startsWith("b")).findFirst());
        for(String item: ls){
            char[] seq = item.toCharArray();
            if(seq[0]==key){
                System.out.println("First match is "+item);
                break;
            }
        }

    }
}
