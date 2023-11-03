package Collection;

import java.util.*;

public class HashMapToArrayList {
    public static void main(String[] args) {
        //hash map to ArrayList
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Devesh",6);
        mp.put("Anand",5);
        System.out.println(mp);

        Set<String> sKey = mp.keySet();
        List<String> ls = new ArrayList<>(sKey);
        System.out.println(ls);
    }
}
