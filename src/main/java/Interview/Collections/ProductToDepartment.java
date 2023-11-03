package Interview.Collections;

import java.util.*;

/*
You are going on a camping trip, but before you leave you need to buy groceries. To optimize your time spent in the store, instead of buying the items from your shopping list in order,
you plan to buy everything you need from one department before moving to the next.
Given an unsorted list of products with their departments and a shopping list, return the time saved in terms of the number of department visits eliminated.
Example:
products = [
    ["Cheese",          "Dairy"],
    ["Carrots",         "Produce"],
    ["Potatoes",        "Produce"],
    ["Canned Tuna",     "Pantry"],
    ["Romaine Lettuce", "Produce"],
    ["Chocolate Milk",  "Dairy"],
    ["Flour",           "Pantry"],
    ["Iceberg Lettuce", "Produce"],
    ["Coffee",          "Pantry"],
    ["Pasta",           "Pantry"],
    ["Milk",            "Dairy"],
    ["Blueberries",     "Produce"],
    ["Pasta Sauce",     "Pantry"]
]

list1 = ["Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"]
For example, buying the items from list1 in order would take 5 department visits, whereas your method would lead to only visiting 3 departments, a difference of 2 departments.
Produce(Blueberries)->Dairy(Milk)->Pantry(Coffee/Flour)->Dairy(Cheese)->Produce(Carrots) = 5 department visits
New: Produce(Blueberries/Carrots)->Pantry(Coffee/Flour)->Dairy(Milk/Cheese) = 3 department visits
list2 = ["Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese"] => 2
list3 = ["Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce"] => 0
list4 = ["Milk", "Flour", "Chocolate Milk", "Pasta Sauce"] => 2
list5 = ["Cheese", "Potatoes", "Blueberries", "Canned Tuna"] => 0
All Test Cases:
shopping(products, list1) => 2
shopping(products, list2) => 2
shopping(products, list3) => 0
shopping(products, list4) => 2
shopping(products, list5) => 0
Complexity Variable:
n: number of products
*/
public class ProductToDepartment {

    public static int ShoppingList(List<String[]> productsDepartment , List<String> ShoppingList){
        int departmentsVisited=0;
        Map<String,List<String>> multiValuemap = new HashMap<>();
        for(String[] Department : productsDepartment){
            String product = Department[0];
            String department = Department[1];
            multiValuemap.computeIfAbsent(department,k-> new ArrayList<>()).add(product);
        }
        Set<String> sVisited = new HashSet<>();
        for(String item : ShoppingList){
            boolean found = false;
            for(Map.Entry<String, List<String>> me : multiValuemap.entrySet()){
                String department = me.getKey();
                List<String> ProductsInDepartment = me.getValue();
                if(ProductsInDepartment.contains(item) && !sVisited.contains(department)){
                    found=true;
                    break;
                }
            }
            if(!found){
                departmentsVisited++;
            }
        }

        return departmentsVisited;
    }
    public static void main(String[] args) {
        List<String[]> ls = Arrays.asList(
        new String[] {"Cheese",          "Dairy"},
        new String[]{"Carrots",         "Produce"},
        new String[]{"Potatoes",        "Produce"},
        new String[]{"Canned Tuna",     "Pantry"},
        new String[]{"Romaine Lettuce", "Produce"},
        new String[]{"Chocolate Milk",  "Dairy"},
        new String[]{"Flour",           "Pantry"},
        new String[]{"Iceberg Lettuce", "Produce"},
        new String[]{"Coffee",          "Pantry"},
        new String[]{"Pasta",           "Pantry"},
        new String[]{"Milk",            "Dairy"},
        new String[]{"Blueberries",     "Produce"},
        new String[]{"Pasta Sauce",     "Pantry"}
        );

        List<String> list1 = Arrays.asList("Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots");
        List<String> list2 =Arrays.asList("Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese");
        List<String> list3 = Arrays.asList("Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce");
        List<String> list4 = Arrays.asList("Milk", "Flour", "Chocolate Milk", "Pasta Sauce");
        List<String> list5 = Arrays.asList("Cheese", "Potatoes", "Blueberries", "Canned Tuna");
        System.out.println(ShoppingList(ls,list1));
        System.out.println(ShoppingList(ls,list2));
        System.out.println(ShoppingList(ls,list3));
        System.out.println(ShoppingList(ls,list4));
        System.out.println(ShoppingList(ls,list5));
    }
}
