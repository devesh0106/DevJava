package Collection;

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
public class ShoppingGrocery {

    public static int shopping(List<String[]> products, List<String> shoppingList ){
    Map<String,List<String>> mp = new HashMap<>();
        int departmentVisted=0;
    //Map Department to Products
        for(String[] productArrays : products){
        String product= productArrays[0];
        String department = productArrays[1];
        mp.computeIfAbsent(department,k-> new ArrayList<>()).add(product);
        }
        departmentVisted = mp.size();
        return departmentVisted;
    }

    public static void main(String[] args) {
        List<String[]> ls= Arrays.asList(
                new String[] {"Cheese","Dairy"},
                new String[] {"Carrots","Produce"},
                new String[] {"Potatoes","Produce"},
                new String[] {"Canned Tuna","Pantry"},
                new String[] {"Romaine Lettuce","Produce"},
                new String[] {"Chocolate Milk","Dairy"},
                new String[] {"Flour","Pantry"},
                new String[] {"Iceberg Lettuce", "Produce"},
                new String[] {"Coffee",          "Pantry"},
                new String[] {"Milk",            "Dairy"},
                new String[] {"Blueberries",     "Produce"},
                new String[] {"Pasta Sauce",     "Pantry"}
        );
        List<String> list1 = Arrays.asList("Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots");
        System.out.println("Departement visited for List 1 is "+shopping(ls,list1));
        List<String> list2 = Arrays.asList("Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese");
        System.out.println("Departement visited for List 2 is "+shopping(ls,list2));
        List<String> list3 = Arrays.asList("Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce");
        System.out.println("Departement visited for List 3 is "+shopping(ls,list3));
        List<String> list4 = Arrays.asList("Milk", "Flour", "Chocolate Milk", "Pasta Sauce");
        System.out.println("Departement visited for List 4 is "+shopping(ls,list4));
        List<String> list5 = Arrays.asList("Cheese", "Potatoes", "Blueberries", "Canned Tuna");
        System.out.println("Departement visited for List 5 is "+shopping(ls,list5));
    }
}
