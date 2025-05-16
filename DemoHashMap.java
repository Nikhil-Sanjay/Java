import java.util.HashMap;
import java.util.Map;

public class DemoHashMap{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Mango", 70);
        map.put("Orange", 40);
        System.out.println("Initial Map: " + map);
        System.out.println("Price of Mango: " + map.get("Mango")); 
        map.replace("Banana", 35);
        System.out.println("After replacing Banana: " + map);
        map.remove("Orange");
        System.out.println("After removing Orange: " + map);
        System.out.println("Contains key 'Apple'? " + map.containsKey("Apple")); 
        System.out.println("Contains value 50? " + map.containsValue(50)); 
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Printing Hashmap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Price of Papaya: " + map.getOrDefault("Papaya", 0)); 
        map.putIfAbsent("Banana", 60);
        map.putIfAbsent("Grapes", 45); 
        System.out.println("After putIfAbsent: " + map);
        map.clear();
        System.out.println("Map after clear: " + map);
        System.out.println("Is map empty? " + map.isEmpty()); 
    }
}
