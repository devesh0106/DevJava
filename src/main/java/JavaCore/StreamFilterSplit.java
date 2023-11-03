package JavaCore;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilterSplit {
    public static void main(String[] argv) {
        List<String> ls = Arrays.asList("Dev-esh", "Poo-ja", "Pa-ri");
       List<String> sStart = ls.stream().filter(x->x.startsWith("P")).collect(Collectors.toList());
        System.out.println(sStart);

        System.out.println("----------------------------");

        String s = "devesh-anand";
        String[] sSplit= s.split("-");
        String resu=sSplit[0];
        System.out.println(resu);
        System.out.println("----------------------------Devesh");
        for(String res : sSplit) {
            System.out.println( res + " ");
        }
        System.out.println("----------------------------");
        List<Integer> lInt = Arrays.asList(1,2,3,4);
        lInt.stream().map(x->x*x).forEach(System.out::println);
        System.out.println("----------------------------");
        Map<String, Integer> mp=ls.stream().collect(Collectors.toMap(y->y,y->y.length()));
        System.out.println(mp);
        System.out.println("----------------------------");
        for(Map.Entry<String,Integer> me : mp.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }

    }
}
