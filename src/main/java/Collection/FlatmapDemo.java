package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4);

        List<Integer> ls1 = Arrays.asList(6,7,8,9);

        List<Integer> ls2 = Arrays.asList(10,11,12,13);

        List<List<Integer>> allLs = Arrays.asList(ls,ls1,ls2);

        System.out.println(allLs); //[[1, 2, 3, 4], [6, 7, 8, 9], [10, 11, 12, 13]]

        //Using FlatMap for transforming and flattening
        List<Integer> lsfm = allLs.stream().flatMap(list->list.stream()).collect(Collectors.toList());
        System.out.println(lsfm);
    }
}
