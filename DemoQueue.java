import java.util.LinkedList;
import java.util.Queue;
public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Mango");
        System.out.println("Queue after offers: " + queue);
        System.out.println("Peek: " + queue.peek()); 
        String polled = queue.poll();
        System.out.println("Polled element: " + polled); 
        System.out.println("Queue after poll: " + queue); 
        System.out.println("Element: " + queue.element()); 
        System.out.println("Contains 'Mango'? " + queue.contains("Mango")); 
        System.out.println("Is queue empty? " + queue.isEmpty()); 
        System.out.println("Queue size: " + queue.size()); 
        System.out.print("Iterating queue: ");
        for (String fruit : queue) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
