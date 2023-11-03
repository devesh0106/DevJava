package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListToMap {
    public static void main(String[] args) {
        List<String> ls= new ArrayList<>();
        ls.add("Devesh");
        ls.add("Anand");

        Map<String,Integer> map = ls.stream().collect(Collectors.toMap(s->s,s->s.length()));
        System.out.println("Generated Map  " +map);
        //System.out.println(map.size());
    }

}
