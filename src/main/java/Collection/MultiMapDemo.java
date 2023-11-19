package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiMapDemo {
    //A Multimap is a general way to associate keys with arbitrarily many values.
    public static void main(String[] args) {
        Map<String, List<String>> mp = new HashMap<>();
        List<String> relation = Arrays.asList("Pooja","Pari","Yuvika");
        mp.put("Devesh",relation);
        System.out.println("Multi Values of Map are "+mp);
        System.out.println("------------------------");
        for(Map.Entry<String,List<String>> me : mp.entrySet()){
            System.out.println("Key is "+ me.getKey());
            System.out.println( "Values are "+ me.getValue());
        }
    }
}
