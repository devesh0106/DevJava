package Array;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceOfElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};

        // Create a HashMap to store the count of each number
        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate through the array and update the count in the map
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the number with the maximum occurrence
        int maxOccurrence = 0;
        int maxNumber = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxOccurrence) {
                maxOccurrence = entry.getValue();
                maxNumber = entry.getKey();
            }
        }

        System.out.println("Number with maximum occurrence: " + maxNumber);
        System.out.println("Maximum occurrence: " + maxOccurrence);
    }
}
