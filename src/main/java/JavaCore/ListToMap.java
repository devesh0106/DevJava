package JavaCore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {

        List<String> ls = Arrays.asList("Devesh", "Anand");
        Map<String,Integer> mp=new HashMap<>();
        mp=ls.stream().collect(Collectors.toMap(s->s,s->s.length()));

        System.out.println(mp);

       for(Map.Entry<String,Integer> me : mp.entrySet())
       {
           System.out.print( me.getKey() +"="+me.getValue());
       }
        System.out.println();
        System.out.println("Without using Stream api");
        for(String sname :ls){
            mp.put(sname,sname.length());
        }
        System.out.println(mp);
    }
}
