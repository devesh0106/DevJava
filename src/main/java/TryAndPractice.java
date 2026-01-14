import java.util.*;
import java.util.stream.Collectors;

public class TryAndPractice {
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
        mp.entrySet().stream().forEach(System.out::println);
        System.out.println(mp);
        System.out.println("--------------------------");
        Set<String> keySet = mp.keySet();
        List<String> ls = new ArrayList<>(keySet);
        System.out.println(ls);
    }
}
