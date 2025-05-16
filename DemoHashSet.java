import java.util.HashSet;
import java.util.Iterator;
public class DemoHashSet{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Banana");
        System.out.println("HashSet: " + set);
        set.remove("Orange");
        System.out.println("After removing Orange: " + set);
        System.out.println("Contains Mango? " + set.contains("Mango")); 
        System.out.println("Size of set: " + set.size());
        System.out.print("Iterating using Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.print("Iterating using for-each: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        String[] array = set.toArray(new String[0]);
        System.out.print("Converted to array: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
        set.clear();
        System.out.println("After clearing set: " + set); 
        System.out.println("Is set empty? " + set.isEmpty()); 
    }
}
