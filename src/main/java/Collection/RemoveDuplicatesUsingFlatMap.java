package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Remove duplicates after flattening
public class RemoveDuplicatesUsingFlatMap {
    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("B", "C")
        );

        List<String> result=data.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}
