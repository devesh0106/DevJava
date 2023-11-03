package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
        public static List<String> wrapLines(List<String> words, int maxLineLength) {
            List<String> result = new ArrayList<>();
            StringBuilder currentLine = new StringBuilder();

            for (String word : words) {
                if (currentLine.length() + word.length() <= maxLineLength) {
                    if (currentLine.length() > 0) {
                        currentLine.append("-");
                    }
                    currentLine.append(word);
                } else {
                    result.add(currentLine.toString());
                    currentLine = new StringBuilder(word);
                }
            }

            if (currentLine.length() > 0) {
                result.add(currentLine.toString());
            }

            return result;
        }

        public static void main(String[] args) {
            List<String> words1 = Arrays.asList(
                    "The", "day", "began", "as", "still", "as", "the",
                    "night", "abruptly", "lighted", "with", "brilliant",
                    "flame"
            );
            System.out.println(wrapLines(words1, 13));

            List<String> words2 =  Arrays.asList("Hello");
            System.out.println(wrapLines(words2, 5));

            List<String> words3 =  Arrays.asList("Hello", "Hello");
            System.out.println(wrapLines(words3, 5));

            List<String> words4 =  Arrays.asList("Well", "Hello", "world");
            System.out.println(wrapLines(words4, 5));

            List<String> words5 =  Arrays.asList("Hello", "HelloWorld", "Hello", "Hello");
            System.out.println(wrapLines(words5, 20));

            List<String> words6 =  Arrays.asList("a", "b", "c", "d");
            System.out.println(wrapLines(words6, 20));
        }
    }



