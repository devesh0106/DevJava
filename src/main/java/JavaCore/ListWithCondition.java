package JavaCore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Check if all elements in a List satisfy a condition (if all are Even Numbers)
public class ListWithCondition {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,2,6,4,8);
        List<Integer> ResultList = ls.stream().filter(e-> e%2==0).collect(Collectors.toList());
        System.out.println("Even :"+ResultList);
       boolean result= ls.stream().allMatch(n->n%2==0);
       if(result==true){
           System.out.println("All Numbers are Even ");
       }
       else
           System.out.println("All Numbers are not Even " );
    }
}
