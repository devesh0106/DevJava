package JavaCore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstJava {
    public static void main(String[] args) {
        System.out.println("Hello Devesh");

        String[] names= {"Devesh","Anand","Pooja"};
        Stream st= Stream.of(names);
        st.forEach(e-> System.out.println(e));

        //Filter Implementation

        List<String> name1 = Arrays.asList("Devesh","Anand","Pooja");
        List<String> resultName= name1.stream().filter(e->e.equals("Devesh")).collect(Collectors.toList());
        System.out.println("Filtered Name "+resultName);

        //Map Implementation

        List<Integer> numbers = Arrays.asList(2,10,30,25);
        List<Integer> squaredNumbers = numbers.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println("Squared Numbers are "+squaredNumbers);
    }
}
