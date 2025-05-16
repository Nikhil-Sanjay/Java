import java.util.LinkedList;
import java.util.Iterator;

public class DemoLinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);            
        list.addFirst(5);        
        list.addLast(20);       
        System.out.println("List after additions: " + list); 
        list.add(1, 15);         
        System.out.println("List after adding at index 1: " + list); 
        list.remove(2);         
        System.out.println("List after removal by index: " + list); 
        list.removeFirstOccurrence(15);
		System.out.println("Printing using Iterator:");
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
        System.out.println("List after removal by value: " + list);
        System.out.println("First element: " + list.getFirst());  
        System.out.println("Last element: " + list.getLast());    
        boolean containsValue = list.contains(10);  
        System.out.println("Contains 10? " + containsValue);  
        System.out.println("Peek first element: " + list.peekFirst()); 
        System.out.println("Peek last element: " + list.peekLast());   
        int first = list.getFirst();   
        System.out.println("First element: " + first);
        LinkedList<Integer> reversedList = new LinkedList<>();
        Iterator<Integer> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            reversedList.add(iterator.next());
        }
        System.out.println("Reversed List: " + reversedList); 
        System.out.println("Size of list: " + list.size());
        list.clear(); 
        System.out.println("List after clearing: " + list);
        System.out.println("Is list empty? " + list.isEmpty());
    }
}

