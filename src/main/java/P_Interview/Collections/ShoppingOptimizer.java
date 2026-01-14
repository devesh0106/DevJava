package P_Interview.Collections;

import java.util.*;

class ShoppingOptimizer {
    public static int shopping(List<List<String>> products, List<String> shoppingList) {
        Map<String, Set<String>> departmentToProducts = new HashMap<>();

        // Build a map from department to the set of products in that department.
        for (List<String> product : products) {
            String productName = product.get(0);
            String departmentName = product.get(1);

            departmentToProducts.computeIfAbsent(departmentName, k -> new HashSet<>()).add(productName);
        }
        int visitsSaved = 0;
        Set<String> visitedDepartments = new HashSet<>();

        for (String item : shoppingList) {
            boolean found = false;

            // Check if the item is available in any unvisited department.
            for (Map.Entry<String, Set<String>> entry : departmentToProducts.entrySet()) {
                String department = entry.getKey();
                Set<String> productsInDepartment = entry.getValue();

                if (productsInDepartment.contains(item) && !visitedDepartments.contains(department)) {
                    visitedDepartments.add(department);
                    found = true;
                    break;
                }
            }

            // If the item was not found in any unvisited department, increment visitsSaved.
            if (!found) {
                visitsSaved++;
            }
        }

        return visitsSaved;
    }

    public static void main(String[] args) {
        List<List<String>> products = Arrays.asList(
                Arrays.asList("Cheese", "Dairy"),
                Arrays.asList("Carrots", "Produce"),
                Arrays.asList("Potatoes", "Produce"),
                Arrays.asList("Canned Tuna", "Pantry"),
                Arrays.asList("Romaine Lettuce", "Produce"),
                Arrays.asList("Chocolate Milk", "Dairy"),
                Arrays.asList("Flour", "Pantry"),
                Arrays.asList("Iceberg Lettuce", "Produce"),
                Arrays.asList("Coffee", "Pantry"),
                Arrays.asList("Pasta", "Pantry"),
                Arrays.asList("Milk", "Dairy"),
                Arrays.asList("Blueberries", "Produce"),
                Arrays.asList("Pasta Sauce", "Pantry")
        );

        List<String> list1 = Arrays.asList("Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots");
        List<String> list2 = Arrays.asList("Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese");
        List<String> list3 = Arrays.asList("Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce");
        List<String> list4 = Arrays.asList("Milk", "Flour", "Chocolate Milk", "Pasta Sauce");
        List<String> list5 = Arrays.asList("Cheese", "Potatoes", "Blueberries", "Canned Tuna");

        System.out.println(shopping(products, list1)); // Output: 2
        System.out.println(shopping(products, list2)); // Output: 2
        System.out.println(shopping(products, list3)); // Output: 0
        System.out.println(shopping(products, list4)); // Output: 2
        System.out.println(shopping(products, list5)); // Output: 0
    }
}


