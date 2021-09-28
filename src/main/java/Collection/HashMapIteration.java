package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String,Integer> mp =new HashMap<>();
        mp.put("Devesh",100);
        mp.put("Anand",101);
        mp.put("Pooja",102);
        mp.put("Sharma",103);
        mp.put("Amit",104);
        mp.put("Shama",105);
        mp.put("Shar",106);
        mp.put("Sha",107);
//        for(Map.Entry<String,Integer> entry : mp.entrySet()){
//            System.out.println("Keys are "+ entry.getKey() + "Values are "+entry.getValue());
//        }

        mp.entrySet().stream().forEach(System.out::println); //Using Stream API
    }
}
