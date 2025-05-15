import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Blueberry");
        System.out.println("List: " + list);
        System.out.println("Element at index 2: " + list.get(2));
        list.set(2, "Blackberry");
        System.out.println("Updated List: " + list);
        list.remove(1);
        System.out.println("After removing index 1: " + list);
        list.remove("Cherry");
        System.out.println("After removing 'Cherry': " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Contains Apple? " + list.contains("Apple"));
        System.out.println("Is Empty? " + list.isEmpty());
        ArrayList<String> newFruits = new ArrayList<>();
        newFruits.add("Mango");
        newFruits.add("Grapes");
        list.addAll(newFruits);
        System.out.println("After addAll: " + list);
        list.removeAll(newFruits);
        System.out.println("After removeAll: " + list);
        list.addAll(newFruits); 
        list.retainAll(Collections.singleton("Mango")); 
        System.out.println("After retainAll: " + list);
        list.clear();
        System.out.println("After clear(): " + list);
        list.add("Kiwi");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        System.out.println("First index of Apple: " + list.indexOf("Apple"));
        System.out.println("Last index of Apple: " + list.lastIndexOf("Apple"));
        Object[] array = list.toArray();
        System.out.print("Array elements: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.println("Iterating with for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
		list.forEach((n)->{System.out.println(n);});
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned List: " + clonedList);
    }
}
