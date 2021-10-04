package JavaCore;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String args[]) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(20);
        ls.add(13);
        ls.add(1);

        System.out.println("Original List "+ls);

        List<Integer> ls2=Arrays.asList(100,101,102);
        //ls2.add(103);
        //System.out.println("List2 "+ls2);

        //Even Numbers without Stream API
        List<Integer> lsEven = new ArrayList<>();
        for(Integer i : ls) {
            if (i % 2 == 0) {
                lsEven.add(i);
            }
        }
        System.out.println("Even Numbers are without Stream "+lsEven);

        //With Stream API
        List<Integer> lsEvenWithStream=ls.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers are with Stream "+lsEvenWithStream);

        List<Integer> lsGreaterthan = ls.stream().filter(i->i>2).collect(Collectors.toList());
        System.out.println("Greater than 2 List "+ lsGreaterthan);
    }
}
